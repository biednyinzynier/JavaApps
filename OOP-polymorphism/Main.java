package com.burak.oop;

public class Main {

	public static void main(String[] args) {
		
		BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(), new EmailLogger(), new FileLogger()};
		
		for (BaseLogger logger : loggers) {
			logger.log();
			logger.log("Message XXX");
		}
		System.out.println("\n");
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();		
	}
}
