package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		
		//int[] num = {10,20,30,50,40,70,65,89,56,23,78,56,32}; 
		
		  //declaring array with max limit
		
		  int[] num = new int[3]; 
		  //all the data in the array are saved with index
		  
		  //to assign data to the array 
		  num[0] = 20; //Index starts with 0 
		  num[1] = 10;
		  num[2] = 30; //last data index should be length of array minus 1
		  //10, 20, 30
		 		
		//to get single data from an array
		//System.out.println(num[1]);
		
		//to get the number of items in an array 
		int len = num.length;
		
		int lastIndex = num.length -1;
		
		//to sort the array values in ascending order
		Arrays.sort(num);
		
		for (int i = num.length-1; i >= 0 ; i--) {
			System.out.println(num[i]);
		}
		
		
		
		
		
		
		
		

	}

}
