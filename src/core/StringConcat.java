package core;

public class StringConcat {

	public static void main(String[] args) {
		
		// + : Operator 
		int a = 100;
		int b = 200;
		
		String str = "Java";
		String abc = "Selenium";
		
		System.out.println(str+abc);
		System.out.println(a+str);  // 100Java
		System.out.println(a+b+abc);  // 300Selenium,  300Selenium
		System.out.println(a+str+b+abc+a);  // 100Java200Selenium100
		System.out.println(b+a+str+(b+a)+str+abc+a);    // 300Java300JavaSelenium100
		System.out.println(a+str+a+b+abc+a+(a+b));   // 100Java300Selenium300, 100Java300Selenium400
		// 100Java100200Selenium100300
		System.out.println(a+b+a+b+str+abc+b+a);   // 600JavaSelenium200100
	}

}
