package string;

public class StringClass {

	public static void main(String[] args) {
		
		// == operator --> it is used for reference comparison(address comparison)
		// .equlas()  --> method is used to content comparison
		
		String name = new String("Abhijeet");
		String name1 = "Abhijeet";
		String name2 = "Pratik";
		String name3 = new String("Pratik");
		String name4 = "Abhijeet";
		String name5 = new String("Pratik");
		String name6 = "Dev";
		String name7 = "Rushikesh";
		String name8 = new String("Rushikesh");
		
		System.out.println(name==name1);  // false
		System.out.println(name2==name3);  // false
		System.out.println(name1==name4);  // true
		System.out.println(name.equals(name1));  // true
		System.out.println(name6.equals(name8));  // false
		System.out.println(name3.equals(name5));   // true
		

	}

}
