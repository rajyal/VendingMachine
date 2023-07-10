package com.vm.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.vm.exceptions.InvalidIdException;
import com.vm.pojos.CoinSlot;
import com.vm.pojos.Product;
import com.vm.service.VendingMachine;
import com.vm.service.VendingMachineImpl;

public class VendingMachineTest {
	
	private VendingMachine vendingMachine;
	
	@Before
	public void setUp() {
		vendingMachine = new VendingMachineImpl();
	}
	
	@After
	public void tearDown() {
		vendingMachine = null;
	}
	

	// 2 coins , water bottle, qty 

	@Test
	public final void testAddProduct() {
		
	
		try {
		 vendingMachine.addProduct(11, "Coke", 34, 98);
		 vendingMachine.addProduct(12, "Pepsi", 14, 92);
		 vendingMachine.addProduct(13, "Water", 54, 8);
		 vendingMachine.addProduct(14, "Milk", 23, 12);
	boolean result=	 vendingMachine.addProduct(15, "Maza", 56, 43);
	assertEquals(true, result);	 
		//vendingMachine. vendingMachine.buyProduct(11);
		 Product p1=new Product("Coke", 34, 98);
		 assertEquals("Coke",  vendingMachine.buyProduct(11,23 ,CoinSlot.DIME).getName());
		 assertNotEquals(98, vendingMachine.buyProduct(12, 23 ,CoinSlot.DIME).getPrice());
		 
		assertEquals(true,vendingMachine.updateProductPrice(14, 67));
		
		Product p=vendingMachine.getProductById(14);
		assertEquals(new Product("Milk", 67,12), p);
		
		
		 
			
			
		} catch (InvalidIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
