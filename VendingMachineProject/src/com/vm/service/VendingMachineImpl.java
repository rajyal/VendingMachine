package com.vm.service;


import java.util.*;

//import javax.management.InvalidAttributeValueException;

import com.vm.exceptions.InvalidIdException;
import com.vm.pojos.CoinSlot;
import com.vm.pojos.Product;


public class VendingMachineImpl implements VendingMachine {
	private Map<Integer, Product> products;
	private double balance;
	private CoinSlot coinSlot;
	private List<Product> sales;
	
	public VendingMachineImpl() {
		this.products = new HashMap<>();
		sales=new ArrayList<>();
		this.balance =0.0;// TODO Auto-generated constructor stub
	}
	
	public boolean addProduct(int code, String name, double price, int qty)throws InvalidIdException {
	//	int size = products.size();
		if(code> 10 && code <=99) {
		products.put(code, new Product( name, price, qty ));
		return true;
		}else {
			
			throw new InvalidIdException("Id is Invalid");
		}
	}
	
	public void insertCoin(double amount, CoinSlot cs) {
		balance+=amount;
		this.coinSlot = cs;
		
	}
	
	public Product buyProduct(int productId)throws InvalidIdException {
		Product product=products.get(productId);
		if(product !=null && product.getQty() >0) {
			product.setQty(product.getQty()-1);
			balance -= product.getPrice();
			sales.add(product);
			return product;
		}else {
			throw new InvalidIdException("Product Id doesnot exists");
		}
		//return null;
	}
	
	public void cleareSelection() {
		products.clear();
	}

	@Override
	public boolean updateProductQty(int productId, int qty)throws InvalidIdException {
	
		Product product=products.get(productId);
		if(qty>0 ) {
		product.setQty(qty);
		return true;
		}
		else {
			throw new InvalidIdException("Invalid qty");
		}
	}

	@Override
	public boolean updateProductPrice(int productId, double price)throws InvalidIdException {

		Product product=products.get(productId);
		if(price> 0) {
		product.setPrice(price);
		return true;
		}
		else {
			throw new InvalidIdException("Invalid Price");
		}
	}

	@Override
	public Product getProductById(int productId)throws InvalidIdException {
		if(productId> 10 && productId<=99) {
		return products.get(productId);
		}else {
			throw new InvalidIdException("Id accepts only two digit number");
		}
	}

	@Override
	public List<Product> sales() throws Exception {
		if(sales.isEmpty()) {
			throw new Exception("No sales");
		}
		return sales;
	}

	@Override
	public Product buyProduct(int productId, double money, CoinSlot cs) throws InvalidIdException {
		Product p=products.get(productId);
		if(p.getPrice() <= money ) {
			sales.add(p);
			p.setQty(p.getQty()-1);
			balance -= p.getPrice();
			return p;
		}else {
			throw new InvalidIdException("Invalid");
		}
	}


	
}
