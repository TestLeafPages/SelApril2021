package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		int[] num = {10,20,30};		
		
		List<Integer> listNum = new ArrayList<Integer>();
		
		for (Integer eachNum : num) {
			listNum.add(eachNum);
			
		}
		
		
		List<String> values = new ArrayList<String>();

		// add data into list
		values.add("Hari"); // index starts with 0
		values.add("Babu");
		values.add("Sam");
		values.add("Hari");
		values.add("Naveen");
		values.add("Dhivya"); // last data index is size()-1

		/*
		 * for (String eachValues : values) {
		 * 
		 * System.out.println(eachValues);
		 * 
		 * }
		 */

		List<String> newValues = new ArrayList<String>();

		for (String eachValue : values) {
			if (!eachValue.equals("Hari")) {
				newValues.add(eachValue);
			}

		}

		System.out.println(newValues);

		/*
		 * newValues.addAll(values);
		 * 
		 * values.remove(3);
		 * 
		 * //to remove all the matching values //newValues.removeAll(values);
		 * 
		 * //to retain all the matching values /newValues.retainAll(values);
		 * 
		 * //method to sort the values in list Collections.sort(values);
		 * 
		 * 
		 * 
		 * //values.remove("Hari");
		 * 
		 * //method to find the number of data System.out.println(values.size());
		 * 
		 * //to get 1 data //System.out.println(values.get(2));
		 * 
		 * 
		 * 
		 * 
		 * for (String eachValue : newValues) { System.out.println(eachValue);
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * for (int i = 0; i < values.size(); i++) { System.out.println(values.get(i));
		 * }
		 * 
		 */

	}

}
