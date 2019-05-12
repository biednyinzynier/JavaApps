package designpatterns.creatpatterns.absfactmethod;

public abstract class Loan {
	double rate;
	
	abstract void getInterestRate(double rate);
	
	public void calculateLoanPayment(double loanAmount, int years, String bankName) {
		int n = years * 12;						// total month
		double newAmount = loanAmount * rate;	// total amount to pay
		double monthlyAmount = newAmount / n;	// monthly payment amount
		
		System.out.println("Your monthly payment is " + monthlyAmount + " Total payment is: " + newAmount 
				+ " for the borrowed from " + bankName + " amount: "+ loanAmount);
	}
}
