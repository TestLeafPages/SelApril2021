package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SortUsingCollection {
	
	public static void main(String[] args) {
		
		String[] values = {"HCL","Wipro","Aspire","Infosys"};
		
		List<String> listValues = new ArrayList<String>();
		
		for (String eachData : values) {
			listValues.add(eachData);
		}
		
		Collections.sort(listValues);
		System.out.println(listValues);
	}

}
