package com.burak.threaddemo;

public class Chronometre implements Runnable{
	// Runnable interface used to create a thread. The runnable interface should be implemented by any class
	// whose instances are intended to be executed by a thread.
	
	private Thread thread;
	private String threadName;
	
	
	public Chronometre(String threadName) {
		this.threadName = threadName;
		System.out.println(threadName + " Creating.");
	}


	@Override
	public void run() {
		System.out.println(threadName + " Running.");
		
		try {
			for(int i = 1; i <= 10; i++) {
				System.out.println(threadName + " : " + i);
				Thread.sleep(1000);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(threadName + " is done.");
	}
	
	public void start() {
		System.out.println("Thread object is creating for -> " + threadName);
		thread = new Thread(this, threadName);	// when this thread started, this object's run method will be invoked
		thread.start();		// Causes this thread to begin execution; the JVM calls the run method of this thread. 
	}
}
