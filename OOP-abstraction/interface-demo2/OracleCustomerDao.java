package com.burak.oop.interfacedemo2;

public class OracleCustomerDao implements ICustomerDao {

	@Override
	public void add() {
		System.out.println("Customer Added: Oracle");

	}

}
