package inheri;

public class RunCarClass {

	public static void main(String[] args) {
		NexonCar objNexonCar = new NexonCar();
		objNexonCar.seatCover();
		objNexonCar.petrol();
		objNexonCar.safty();
		objNexonCar.start();
		objNexonCar.whiteColor();   
		
		CarClass objCarClass = new CarClass();
		objCarClass.petrol();
//		objCarClass.seatCover();  we can't access property of child class

	}

}
