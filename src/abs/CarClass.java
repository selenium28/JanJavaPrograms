package abs;

public abstract class CarClass {

	//Abstraction(0 - 100%) --> Partial Abstraction (50%)
	// Hiding the internal details & showing the essential thing to the user is known as Abstraction.
	
	// Abstract method - No method body
	public abstract void pertolCar();

	// Non-Abstract method
	public void dieselCar() {
		System.out.println("CarClass--> DieselCar");
	}

	// Abstract method - No method body
	public abstract void seatCover();

	// Non-Abstract method
	public void fourWheeler() {
		System.out.println("CarClass--> fourWheeler");
	}

}
