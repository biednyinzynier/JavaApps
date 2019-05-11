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
		
		hello();
	}
	
	// If we don't declare as static this method we can't access directly
	// Because main has already exists. We can't call a non existing methods in an existing method
	public static void hello() {
		System.out.println("Hello");
	}
}
