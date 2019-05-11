package com.burak.statickeyword;

public class Product {
	static int id;	// if we declare id as static
	String name; 
	double price;
	
	public Product(int id, String name, double price) {
		Product.id = id;	// can't use this or super because it doesn't belong object it belongs the class.
		this.name = name;
		this.price = price;
	}
}
