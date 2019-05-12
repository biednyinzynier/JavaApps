package designpatterns.creatpatterns.absfactmethod;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String banks = "Banks:\n"
					+ "ZiraatBank -> 'ZB'\n"
					+ "Akbank -> 'AB'\n"
					+ "INGBank -> 'IB'";
		String loans = "Loans:\n"
					+ "Personal Loan -> 'personal'\n"
					+ "House Loan -> 'house'\n"
					+ "Car Loan -> 'car'";
		
		System.out.println(banks);
		System.out.print("Enter the name of bank where you want to take loan: ");
		String bankName = scanner.nextLine();
		
		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");			// Creating BankFactory object
		String bank = bankFactory.getBank(bankName).getBankName();					// Creating Bank object and get bank name
		
		System.out.println(loans);
		System.out.print("Enter the type of loan what you want: ");
		String loanType = scanner.nextLine();
		System.out.print("Enter the loan amount that you want: ");
		Double loanAmount = scanner.nextDouble();
		System.out.print("Enter the year that you want: ");
		int years = scanner.nextInt();
		
		double rate = RateCalculator.calculateRate(loanType);						// Calculate the rate according to loan type
		
		AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");			// Creating LoanFactory object
		Loan loan = loanFactory.getLoan(loanType);									// Creating Loan object
		
		loan.getInterestRate(rate);													// Setting the rate to calculate loan payment
		loan.calculateLoanPayment(loanAmount, years, bank); 						// Calculating the loan payment and printing the amounts
	}
	
}
