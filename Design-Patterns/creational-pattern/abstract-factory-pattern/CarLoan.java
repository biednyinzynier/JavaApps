package designpatterns.creatpatterns.absfactmethod;

public class CarLoan extends Loan{

	@Override
	void getInterestRate(double rate) {
		super.rate = rate;
	}
}
