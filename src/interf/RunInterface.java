package interf;

public class RunInterface {

	public static void main(String[] args) {
		
		HDFCBank objHDFCBank = new HDFCBank();
//		objHDFCBank.aTMMachine();
		objHDFCBank.creditCard();
		objHDFCBank.debitCard();
		objHDFCBank.rateOFR();
		
//		BankInterface objBankInterface = new BankInterface();  //Cannot create object of Interface
		
		BankInterface objBankInterface = new HDFCBank();  // Dynamic Polymorphism
		objBankInterface.creditCard();
		objBankInterface.debitCard();
		objBankInterface.rateOFR();
		
		
		BankInterface objICICIBank = new ICICIBank();
		
		
		
		
	}

}
