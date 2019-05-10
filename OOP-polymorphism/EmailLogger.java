package com.burak.oop;

public class EmailLogger extends BaseLogger{

	@Override
	public void log(String message) {
		System.out.println("Logged to Email: " + message);
	}
	
	public void log(String message, String email) {
		System.out.println("Logged to Email: " + message + " to " + email);
	}
	
}
