package oops_Basic;

public class MethodsInJava {

	// Methods: also call the Functions
	// Main method: Starting of the program
	public static void main(String[] args) {
		MethodsInJava obj = new MethodsInJava();
		obj.sleep();
		int m = obj.eat();
		System.out.println(m);
		int d = obj.speaking(50, 100);
		System.out.println(d);
	}
	
	// Return type: Void --> Does not return anything
	public void sleep() {   // No Input & No Output
		System.out.println("Sleeping");
		int l = 10;
		int o = 30;
		int s = l + o;
		System.out.println(s);
	}
	
	public int eat() {    // No Input & Some Output
		int x = 10;
		int y = 20;
		int z = y + x;
		
		return z;
	}
	
	public int speaking(int a, int b) {  // Some Input & Some Output
		
		int c = a + b;
		
		return c;
		
	}
	
}
