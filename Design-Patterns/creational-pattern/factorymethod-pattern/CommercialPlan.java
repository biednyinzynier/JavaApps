package designpatterns.creatpatterns.factorymethod;

public class CommercialPlan extends Plan{
	String planName = "Commercial Plan";

	@Override
	void getRate() {
		rate = 5.50;
	}
}
