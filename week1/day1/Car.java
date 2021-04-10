package week1.day1;

//AccessSpecifier keyword	ClassName
public class Car {
	//datatype vaiableName = value;
		long ownerPhNo = 8884151543L;
		float fuelCapacity = 35.5f;
		double carPrice = 800000.25;
		boolean isPuncture = false;
		char fuelType = 'P';
		String carColor = "Red";
		
	// AccessSpecier returnType methodName()
	public void driveCar() {
		int kmDriven = 450;
		/*
		 * System.out.println(kmDriven); System.out.println(ownerPhNo);
		 */
		System.out.println("Driving a car"); // syso+cntrl+space
	}

	public void applyBrake() {
		System.out.println("Applied Brake");
	//	System.out.println(ownerPhNo);

	}

	public static void main(String[] args) {
		// ClassName objectName = new ClassName();
		Car myCar = new Car();

		// to call the method, objectName.methodName();
		myCar.driveCar();
		myCar.applyBrake();
		
		System.out.println(myCar.ownerPhNo);
		
		float fc = myCar.fuelCapacity;
		System.out.println(fc);
		
		System.out.println("The car price is "+myCar.carPrice);
	}

}
