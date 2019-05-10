package com.burak.oop;

public class Test {

	public static void main(String[] args) {
		TeacherKrediManager krediManager1 = new TeacherKrediManager();
		StudentKrediManager krediManager2 = new StudentKrediManager();
		FarmerKrediManager krediManager3 = new FarmerKrediManager();
		
		double k1 = krediManager1.calculate(50000);
		double k2 = krediManager2.calculate(10000);
		double k3 = krediManager3.calculate(70000);
		
		System.out.println("��retmen kredisi: " + k1 + " kredi oran�: " + krediManager1.bankRate);
		System.out.println("��renci kredisi: " + k2 + " kredi oran�: " + krediManager2.bankRate);
		System.out.println("�iftci kredisi: " + k3 + " kredi oran�: " + krediManager3.bankRate);
	}

}
