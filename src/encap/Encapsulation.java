package encap;

public class Encapsulation {

	// Encapsulation is also called Data Hiding
	private int empid;
	private double salary;
	private String name; 
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setEmpid(12345);
		obj.setName("Pratik");
		obj.setSalary(55000.50);
		
		System.out.println("Name of the emp: " +obj.getName());
		System.out.println("Salry of the emp: " +obj.getSalary());
		System.out.println("emp id: " +obj.getEmpid());

	}

}
