package designpatterns.creatpatterns.factorymethod;

public class UniversityPlan extends Plan{
	String planName = "University Plan";

	@Override
	void getRate() {
		rate = 7.50;
	}
}
