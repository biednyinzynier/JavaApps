package designpatterns.creatpatterns.absfactmethod;

public class LoanFactory extends AbstractFactory{
	@Override
	public Bank getBank(String bank) {
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		
		if(loan.equalsIgnoreCase("Personal")) {
			return new PersonalLoan();
		}
		else if (loan.equalsIgnoreCase("House")) {
			return new HouseLoan();
		}
		else if (loan.equalsIgnoreCase("Car")) {
			return new CarLoan();
		}
		return null;
		
	}
}
