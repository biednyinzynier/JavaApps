package com.burak.oop;

public class Product {
	private int id;
	private String name;
	private String model;
	private double price;
	private String color;
	private int stockAmount;
	private String productCode;
	
	public Product(int id, String name, String model, double price, String color, int stockAmount) {
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
		this.color = color;
		this.stockAmount = stockAmount;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getProductCode() {
		productCode = this.name.substring(0, 1) + this.id;
		return productCode;
	}
	
}
