package oops_Basic;

public class GlobalVariables {

	int m = 50;
	String name = "Dev";
	int n = 50;
	
	public static void main(String[] args) {  
		
		int a = 200;  // local variables --> scope of the local variables with in the method
		int b = 400;
		System.out.println(a+b);
		
		GlobalVariables obj = new GlobalVariables();
		obj.sum();
		obj.display();
//		System.out.println(obj.m+obj.name);
	}
	
	public void sum() {
		
		System.out.println(m+n);
	}
	
	public void display() {
		System.out.println(name);
	}
	

}
