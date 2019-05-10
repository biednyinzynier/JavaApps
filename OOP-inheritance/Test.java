package com.burak.oop;

public class Test {

	public static void main(String[] args) {
		TeacherKrediManager krediManager1 = new TeacherKrediManager();
		StudentKrediManager krediManager2 = new StudentKrediManager();
		FarmerKrediManager krediManager3 = new FarmerKrediManager();
		
		double k1 = krediManager1.calculate(50000);
		double k2 = krediManager2.calculate(10000);
		double k3 = krediManager3.calculate(70000);
		
		System.out.println("Öğretmen kredisi: " + k1 + " kredi oranı: " + krediManager1.bankRate);
		System.out.println("Öğrenci kredisi: " + k2 + " kredi oranı: " + krediManager2.bankRate);
		System.out.println("Çiftci kredisi: " + k3 + " kredi oranı: " + krediManager3.bankRate);
	}

}
