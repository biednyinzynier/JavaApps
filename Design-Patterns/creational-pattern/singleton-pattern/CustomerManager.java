package designpatterns.creatpatterns.singleton;

public class CustomerManager {
	private static CustomerManager customerManager;
	
	// private constructor, to restrict the instantiate object and force to use getInstance method to create objects
	private CustomerManager() {
		
	}
	
	public static CustomerManager getInstance() {
		if(customerManager==null) {
			
			// To make thread safe, only one thread can create object at a time.
			synchronized (CustomerManager.class) {
				if (customerManager==null) {
					customerManager = new CustomerManager();
				}
			}
		}
		return customerManager;
	}
}
