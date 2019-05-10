package com.burak.oop;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1,"laptop", "acer", 3500, "black", 25);
		Product product2 = new Product(2,"mobile", "samsung", 2500, "white", 15);
		Product product3 = new Product(3,"mobile", "apple", 4500, "white", 10);
		
		System.out.println(product1.getName());
		System.out.println(product1.getProductCode());
		
		System.out.println(product2.getModel());
		System.out.println(product2.getStockAmount());
		System.out.println(product2.getProductCode());
		
		System.out.println(product3.getModel());
		System.out.println(product3.getColor());
		System.out.println(product3.getProductCode());
	}

}
