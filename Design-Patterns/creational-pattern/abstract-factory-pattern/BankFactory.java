package designpatterns.creatpatterns.absfactmethod;

public class BankFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bank) {
		
		if(bank.equalsIgnoreCase("AB")) {
			return new AkBank();
		}
		else if (bank.equalsIgnoreCase("IB")) {
			return new IngBank();
		}
		else if (bank.equalsIgnoreCase("ZB")) {
			return new ZiraatBank();
		}
		return null;
		
	}
	
	@Override
	public Loan getLoan(String loan) {
		return null;
	}
}
