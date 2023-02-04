package contrc;

public class SequenceOfExecution {
	
	// Execution Sequence: Static Block --> main method --> Block --> (main method) --> 
	// Object Create -> Automatically calls the constructor --> Method

	
	{
		System.out.println("Blank Block");
	}
	
	static
	{
		System.out.println("Static block");
	}
	
	public void demo() {
		System.out.println("Demo method");
	}
	
	SequenceOfExecution(){
		System.out.println("Constractor block ");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		System.out.println("Main method - second");
		SequenceOfExecution obj = new SequenceOfExecution();
		obj.demo();

	}
	
}
