package designpatterns.creatpatterns.absfactmethod;

public class PersonalLoan extends Loan{

	@Override
	void getInterestRate(double rate) {
		super.rate = rate;
	}
}
