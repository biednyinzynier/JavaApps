package com.burak.oop;

public class BaseLogger {
	
	// Method Overloading: happens when various methods with the same name are in a class.
	
	public void log() {
		System.out.println("Default logged with no message");
	}
	
	public void log(String message) {
		System.out.println("Default logged: " + message);
	}
}
