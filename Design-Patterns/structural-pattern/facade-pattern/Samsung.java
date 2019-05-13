package designpatterns.structural.facade;

public class Samsung implements MobileShop {

	@Override
	public void model() {
		System.out.println("Samsung Galaxy S10");

	}

	@Override
	public void price() {
		System.out.println("7500.0 TL");

	}

}
