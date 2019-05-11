package com.burak.staticvariable;

public class Main {

	public static void main(String[] args) {
		Viewer viewer1 = new Viewer();
		Viewer viewer2 = new Viewer();
		
		viewer1.increment();
		System.out.println("Viewer1: count is : " + viewer1.count);
		viewer2.increment();
		System.out.println("Viewer2: count is : " + viewer2.count);
		
		// The count created once by memory. Whenever we create a new object, it is incrementing.
	}
	
}
