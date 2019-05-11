package com.burak.oop.interfacedemo;

public class OutsourceWorker implements IWorkable, IEatable {
	
	@Override
	public void eat() {
		System.out.println("Outsource guy is eating");

	}

	@Override
	public void work() {
		System.out.println("Outsource guy is working");

	}

}
