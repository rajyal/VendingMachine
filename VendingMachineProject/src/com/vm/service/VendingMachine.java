package com.vm.service;

import java.util.List;

import com.vm.exceptions.InvalidIdException;
import com.vm.pojos.CoinSlot;
import com.vm.pojos.Product;

public interface VendingMachine {

	public boolean addProduct(int code, String name, double price, int qty)throws InvalidIdException;
	public void insertCoin(double amount, CoinSlot cs);
	public Product buyProduct(int productId, double price, CoinSlot cs)throws InvalidIdException;
	public void cleareSelection();
	public boolean updateProductQty(int productId,int qty)throws InvalidIdException;
	public boolean updateProductPrice(int productId, double price)throws InvalidIdException;
	public Product getProductById(int productId)throws InvalidIdException;
	public List<Product> sales()throws Exception;
	
}
