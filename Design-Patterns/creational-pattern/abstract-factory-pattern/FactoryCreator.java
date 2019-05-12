package designpatterns.creatpatterns.absfactmethod;

public class FactoryCreator {
	// FactoryCreator class to get the factories by passing an information such as Bank or Loan
	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("Bank")) {
			return new BankFactory();
		}
		else if (choice.equalsIgnoreCase("Loan")) {
			return new LoanFactory();
		}
		return null;
	}
}
