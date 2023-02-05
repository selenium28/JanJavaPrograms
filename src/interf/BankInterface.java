package interf;

public interface BankInterface {
	
	// No method body
	// we can achieve 100% abstraction
	// Can we create object of interface ?
	// No
	// Always define only abstract methods.
	
	public void debitCard();

	public void creditCard();
	
	public void rateOFR();
	
//	default void aTMMachine() {
//		System.out.println("BankInterface  --> ATM Machine");
//	}

}
