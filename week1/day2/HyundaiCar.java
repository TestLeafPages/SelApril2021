package week1.day2;

import java.util.Scanner;

public class HyundaiCar {
	
	public void getModelPrice(char model, char fuelType) {
		
		if(model =='A' && fuelType == 'P') {
			System.out.println("100000");
			
		}else if(model =='A' && fuelType == 'D') {
			System.out.println("150000");
		}
		
	
	}
	
	//s, v, x
	public int getXcentPrice(char variant) {
		
		int carPrice;
		if(variant == 's') {
			carPrice = 100000;
		}else
		{
			carPrice = 200000;
		}
			
		return carPrice; 

	}
	
	

	public static void main(String[] args) {
		HyundaiCar hc = new HyundaiCar();
					
		hc.getModelPrice('A', 'D');
		
		
		System.out.println(hc.getXcentPrice('s'));
		

	}

}
