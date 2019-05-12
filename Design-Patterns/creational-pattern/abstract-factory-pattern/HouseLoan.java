package designpatterns.creatpatterns.absfactmethod;

public class HouseLoan extends Loan{

	@Override
	void getInterestRate(double rate) {
		super.rate = rate;
	}
}
