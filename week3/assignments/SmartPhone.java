package week3.assignments;

public class SmartPhone extends AndroidPhone {
	
	@Override
	public void takeVideo() {
		System.out.println("video using smart phone");
	}

	
	public static void main(String[] args) {
		SmartPhone sp  = new SmartPhone();
		
		sp.takeVideo();
		
	}
}
