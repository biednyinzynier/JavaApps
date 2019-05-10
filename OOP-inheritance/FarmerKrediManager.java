package com.burak.oop;

public class FarmerKrediManager extends BaseKrediManager{
	public double bankRate = 1.30;

	@Override
	public double calculate(double amount) {
		return amount * bankRate;
	} 
	
}
