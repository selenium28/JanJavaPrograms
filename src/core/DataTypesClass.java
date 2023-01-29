package core;

public class DataTypesClass {   // class body

	// Main method / Starting Point
	public static void main(String[] args) {  // method body
		
		//1. Primitive Data Types: int, double, char and boolean
		//2. Non-Primitive Data Types: String and Array
		// 1. Integer - Numbers (positive/negative: 1,-1)
		// int - datatypes, a - variable, 1,10,33 & -5 - values
		int a = 1;
		int b = 10;
		int t = 33;
		int m = -5;
//		int d = 122.50;  Type mismatch: cannot convert from double to int
//		int a = 10; Duplicate variables are not allowed
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		
		// 2. Double
		double d = 33.33;
		double d1 = 50.55;
		double d2 = 100.00;
		double d3 = 50;
		System.out.println(d1);
		System.out.println(d+d2);
		
		// 3. Char
		char c = 'S';
		char c2 = 'A';
		char c1 = 'B';
		System.out.println(c1);
		
		// 4. Boolean
		// What is the return type of Boolean?
		// True or False
		// Is true & false are values or keywords?
		// Yes true & false are vales but they are also keywords in Java.
		boolean b1 = true;
		boolean b2 = false;
		
		// 5. String
		// Sequence of char
		String str = "Rushikesh";
		String str2 = "ABCD";
		String str3 = "!@#SE$%+ABCD";
		
		System.out.println(str);
		
		
	}

}
