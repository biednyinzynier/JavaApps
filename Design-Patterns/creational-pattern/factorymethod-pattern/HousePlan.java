package designpatterns.creatpatterns.factorymethod;

public class HousePlan extends Plan{
	String planName = "House Plan";
	
	@Override
	void getRate() {
		rate = 3.50;
	}
}
