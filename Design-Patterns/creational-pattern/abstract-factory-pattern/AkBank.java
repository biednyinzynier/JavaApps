package designpatterns.creatpatterns.absfactmethod;

public class AkBank implements Bank {
	private final String bankName = "AkBank";

	@Override
	public String getBankName() {
		return bankName;
	}

}
