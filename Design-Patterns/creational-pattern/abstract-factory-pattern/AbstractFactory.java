package designpatterns.creatpatterns.absfactmethod;

public abstract class AbstractFactory {
	// AbstractFactory class : to generate the object of concrete class based on given information
	public abstract Bank getBank(String bank);
	public abstract Loan getLoan(String loan);
}
