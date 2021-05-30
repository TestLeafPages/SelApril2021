package week8.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*put() -> to add data into map
 *size() -> count the entries
 * get(key) -> to get the value for a key
 * remove() -> to remove an entry from map
 * entrySet() -> to get the key & value as one entry
 * containsKey() - to check the key is already available in the map
 * 
 */
public class LearnMap {

	public static void main(String[] args) {
		//key,value
		Map<String,Integer> values = new TreeMap<String,Integer>();
		
		values.put("xcent", 800000);
		values.put("city", 1500000);
		values.put("swift", 800000);
		values.put("Baleno", 1000000);
		
		values.put("xcent", 900000);
		
		System.out.println(values.get("xcent"));
		
		/*
		 * System.out.println(values.containsKey("swift"));
		 * 
		 * System.out.println(values.size());
		 * 
		 * System.out.println(values.get("city"));
		 * 
		 * //values.remove("city");
		 * 
		 * //System.out.println(values.get("city"));
		 * 
		 * System.out.println(values);
		 * 
		 * Set<Entry<String, Integer>> entrySet = values.entrySet();
		 * 
		 * for (Entry<String, Integer> eachEntry : entrySet) {
		 * //System.out.println(eachEntry); System.out.println(eachEntry.getKey());
		 * System.out.println(eachEntry.getValue()); }
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
