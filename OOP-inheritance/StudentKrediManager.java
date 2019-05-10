package com.burak.oop;

public class StudentKrediManager extends BaseKrediManager{
	public double bankRate = 1.10;

	@Override
	public double calculate(double amount) {
		return amount * bankRate;
	} 
	
}
