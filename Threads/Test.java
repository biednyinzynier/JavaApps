package com.burak.threaddemo;

public class Test {

	public static void main(String[] args) {
		// Creating chronometre thread objects
		
		Chronometre thread1 = new Chronometre("thread-1");
		Chronometre thread2 = new Chronometre("thread-2");
		Chronometre thread3 = new Chronometre("thread-3");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
}
