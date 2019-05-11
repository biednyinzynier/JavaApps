package com.burak.oop.abstractclass;

public class Main {

	public static void main(String[] args) {
		CustomerManager manager = new CustomerManager();
		
		manager.getDatabase(new SqlDatabaseManager());
		
	}
}
