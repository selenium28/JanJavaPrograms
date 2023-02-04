package contrc;

public class ConstractorClass {
	
	// When we are creating an Object, then Constructor will call automatically.
	// Constructor name must be same as class name
	// Constructor does not have return type.
	// we can access modifier --> public, private, protected & default

	public static void main(String[] args) {
		System.out.println("Main method");
		ConstractorClass obj = new ConstractorClass();
		obj.display();

	}
	
	public void display() {
		System.out.println("Display method");
	}
	
	ConstractorClass(){
		System.out.println("Constractor block");
	}

}
