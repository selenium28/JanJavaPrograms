package core;

public class ArrayConcept {

	public static void main(String[] args) {
		// To store similar Data types in array variable, int to int, double to double, char to char,String to String
		
//		int i = 10; 
//		int i = 20;  // it is not allowed, duplicate variables are not allowed in Java.
		int i[] = new int[5];
		i[0] = 10;
		i[1] = 20;
		i[2] = 50;
		i[3] = 10;
		i[4] = 70;
//		i[5] = 90;   // ArrayIndexOutOfBoundsException:
		
//		System.out.println(i[3]);
//		System.out.println(i[0]);
//		System.out.println(i[5]);  // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		System.out.println(i.length);
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
			
		}
		
		double d[] = new double[4];
		d[0] = 33.33;
		d[3] = 100;
		
		System.out.println(d[3]);
		
		char c[] = new char[5];
		c[0] = 'A';
		c[1] = 'g';
		c[2] = '#';
		c[3] = '3';
		
		System.out.println(c.length);
		for (int m = 0; m < c.length; m++) {
			System.out.println(c[m]);
			
		}
		
		boolean f[] = new boolean[2];
		f[0] = true;
		f[1] = false;
		
		String s[] = new String[4];
		s[3] = "Java";
		
		// Object Array: In Object Array we can store diff. data types, like int, double, char, boolean & String
		Object obj[] = new Object[5];  
		obj[0] = 100;
		obj[1] = "Dev";
		obj[2] = 33.33;
		obj[3] = 'G';
		
		System.out.println(obj[1]);
		
	}

}
