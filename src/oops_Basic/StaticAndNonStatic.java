package oops_Basic;

public class StaticAndNonStatic {
	
	int a = 100;
	static String name = "Dev";
	String str;

	public static void main(String[] args) {
		System.out.println("Main Method");
		
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sum();
		obj.city();
		add();    // direct calling 
		StaticAndNonStatic.display();    // By using class name
		
		System.out.println(obj.a);
		System.out.println(StaticAndNonStatic.name);

	}
	
	public void sum() {
		System.out.println("Sum Non-Static Method");
	}
	
	public static void display() {
		System.out.println("Display Static Method");
	}
	
	public static void add() {
		System.out.println("Add Static Method");
	}
	
	public void city() {
		System.out.println("City Non-Static Method");
	}

}
