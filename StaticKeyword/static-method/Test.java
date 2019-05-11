package com.burak.statickeyword;

public class Test {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Laptop", 3000);
		ProductManager manager = new ProductManager();
		manager.add(product1);
		
		Product product2 = new Product(2, "Mobile", -5);
		manager.add(product2);
		
		Product product3 = new Product(3, "", 1500);
		manager.add(product3);
		
	}

}
