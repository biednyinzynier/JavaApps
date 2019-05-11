package com.burak.oop.interfacedemo2;

public class CustomerManager {
	private ICustomerDao customerDao;

	public CustomerManager(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	public void add() {
		// Business logic
		this.customerDao.add();
	}	
	
}
