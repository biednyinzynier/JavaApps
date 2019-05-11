package com.burak.oop.interfacedemo2;

public class MySqlCustomerDao implements ICustomerDao {
	
	@Override
	public void add() {
		System.out.println("Customer Added: MySql");

	}

}
