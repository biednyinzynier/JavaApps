package com.burak.oop.interfacedemo;

public class Worker implements IEatable, IPayable, IWorkable {
	
	@Override
	public void work() {
		System.out.println("Company worker is working");

	}

	@Override
	public void pay() {
		System.out.println("Company worker getting paid");

	}

	@Override
	public void eat() {
		System.out.println("Company worker is eating");

	}

}
