package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<Integer> num = new TreeSet<Integer>();
		
		num.add(500);
		num.add(200);
		num.add(300);
		System.out.println(num.add(100));
		num.add(600);
		num.add(400);
		
		System.out.println(num.add(100));
		
		System.out.println(num.size());
		
		List<Integer> listNum = new ArrayList<Integer>(num);
	//	listNum.addAll(num);
		
		System.out.println(listNum.get(0));
		
		/*
		 * for (Integer eachNum : num) {
		 * 
		 * System.out.println(eachNum);
		 * 
		 * }
		 */

	}

}
