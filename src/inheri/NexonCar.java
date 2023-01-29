package inheri;

public class NexonCar extends CarClass{ // child class   --> IS-A Relationship
	
	// MethodOverriding--> When same method is present in parent class as well as in child class with same name & 
	// same input parameters is called a MethodOverriding.
	
	// Inheritance--> It is inheriting the properties of parent class into child class.
	// It is mainly use for code reuseability
	public void seatCover() {
		System.out.println("NexonCar---> SeatCover");
	}
	
	public void whiteColor() {
		System.out.println("NexonCar---> whiteColor");
	}

}
