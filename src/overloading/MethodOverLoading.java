package overloading;

public class MethodOverLoading {

	// Duplicate methods are not allowed in Java
	// Method inside method is not allowed in Java
	// MethodOverloading --> When the method name is same with different input parameters within 
	// the same class is known as MethodOverloading.
	
	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.display();
		obj.display(10);
		obj.display(50, 100);

	}
	
	// Can we overload main method?
	// Yes
	// But this is not a good practice.
//	public static void main() {
//		
//	}
	
	public void display() {  // 0 input parameters
		System.out.println("display------> 0 input parameters");
	}
	
	public void display(int a) {  // 1 input parameters
		System.out.println("display------> 1 input parameters");
	}
	
	public void display(int m, int n) {  // 2 input parameters
		System.out.println("display------> 2 input parameters");
	}
	
	public void display(String str) {  // 1 input parameters
		System.out.println("display------> 1 input parameters");
	}
	

}
