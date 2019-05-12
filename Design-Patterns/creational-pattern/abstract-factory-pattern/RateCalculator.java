package designpatterns.creatpatterns.absfactmethod;

public class RateCalculator {
	
	public static double calculateRate(String loanType) {
		if (loanType.equals("personal")) {
			return 1.20;
		}
		else if (loanType.equals("car")) {
			return 1.35;
		}
		else if (loanType.equals("house")) {
			return 1.50;
		}
		return 1.10;
	}
}
