package week4day2new;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMAP {

	public static void main(String[] args) {
	Map<String, Integer> map= new LinkedHashMap<String, Integer>();
	map.put("Iphone", 50000);
	map.put("OnePlus", 40000);
	map.put("Blackberry", 30000);
	map.put("Samsung", 75000);
	map.put("OnePlus", 60000);
	System.out.println(map);
	
	Set<String> keys = map.keySet();
	for(String eachKey : keys) {
		System.out.println(eachKey+"-> "+map.get(eachKey));
	
	map.remove("One Plus");
	Set<String> keySet = map.keySet();
	for(String eachKeys : keys) {
		System.out.println(eachKeys+"-> "+map.get(eachKeys));
		
		
		
		
		
		
	}
	
	//map entry set and then press ctrl+2,L
	//Set<Entry<String, Integer>> entrySet = map.entrySet();
		/*
		 * for(Entry<String,Integer> eachEntry:map.entrySet()) {
		 * System.out.println(eachEntry.getKey()+" ->"+eachEntry.getValue()); }
		 */
	
	//map.get();
//	System.out.println(map.get("Iphone"));
//	System.out.println(map.containsKey("Samsung"));
//	System.out.println(map.containsValue(75000));
	}

}
}

