package com.burak.oop;

public class CustomerManager {
	private BaseLogger logger;

	public CustomerManager(BaseLogger baseLogger) {
		this.logger = baseLogger;
	}
	
	public void add() {
		System.out.println("Customer Added!");
		this.logger.log("LOG MESSAGE XYZxyz");
	}
}
