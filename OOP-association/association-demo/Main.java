package com.burak.associationdemo;

public class Main {

	public static void main(String[] args) {
		
		Bank bank = new Bank("Ziraat Bank");
		Employee employee = new Employee("Burak");
		Employee employee2 = new Employee("Ömer");
		Employee employee3 = new Employee("Caner");
		
		System.out.println(employee.getName() + " is a employee of " + bank.getName());
		System.out.println(employee2.getName() + " is a employee of " + bank.getName());
		System.out.println(employee3.getName() + " is a employee of " + bank.getName());
	}

}
