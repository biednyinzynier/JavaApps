package designpatterns.creatpatterns.absfactmethod;

public class ZiraatBank implements Bank {
	private final String bankName = "ZiraatBank";
	
	@Override
	public String getBankName() {
		return bankName;
	}

}
