package week3.day1;

public class OfficeCar {
	
	public void soundHorn() {
		System.out.println("sound horn");

	}

	public static void main(String[] args) {
		
		OwnCar oc = new OwnCar();
		oc.applyBrake();
		
		OfficeCar offCar = new OfficeCar();
		offCar.soundHorn();
		

	}

}
