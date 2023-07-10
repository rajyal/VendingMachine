package com.vm.pojos;

import java.util.Objects;

public class Product {
	//private int id;
	private String name;
	private double price;
	private int qty;
	public Product( String name, double price, int qty) {
		super();
		//this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(name, price, qty);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && qty == other.qty;
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	

}
