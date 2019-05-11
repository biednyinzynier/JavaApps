package com.burak.oop.interfacedemo2;

public class SqlCustomerDao implements ICustomerDao {

	@Override
	public void add() {
		System.out.println("Customer Added: Sql");

	}

}
