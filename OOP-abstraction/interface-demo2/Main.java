package com.burak.oop.interfacedemo2;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDao());
		
		customerManager.add();

	}

}
