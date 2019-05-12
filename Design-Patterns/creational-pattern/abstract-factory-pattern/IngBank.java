package designpatterns.creatpatterns.absfactmethod;

public class IngBank implements Bank {
	private final String bankName = "INGBank";
	
	@Override
	public String getBankName() {
		return bankName;
	}

}
