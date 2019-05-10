package com.burak.oop;

public class BaseKrediManager {
	public double bankRate = 1.50; 
	
	public double calculate(double amount) {
		return amount * bankRate;
	}
}
