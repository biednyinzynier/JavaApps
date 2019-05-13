package designpatterns.structural.facade;

public class Huawei implements MobileShop {

	@Override
	public void model() {
		System.out.println("Huawei P20");

	}

	@Override
	public void price() {
		System.out.println("3000.0 TL");

	}

}
