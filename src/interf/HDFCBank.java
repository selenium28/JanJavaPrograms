package interf;

public class HDFCBank implements BankInterface{

	@Override
	public void debitCard() {
		System.out.println("HDFCBank --> debitCard ");
		
	}

	@Override
	public void creditCard() {
		System.out.println("HDFCBank --> creditCard ");
		
	}

	@Override
	public void rateOFR() {
		System.out.println("HDFCBank --> rateOFR ");
		
	}

}
