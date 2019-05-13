package designpatterns.structural.facade;

public class IPhone implements MobileShop {

	@Override
	public void model() {
		System.out.println("IPhone X");

	}

	@Override
	public void price() {
		System.out.println("8000.0 TL");

	}

}
