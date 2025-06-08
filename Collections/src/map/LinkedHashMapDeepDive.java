package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDeepDive {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		
		// Crud Create Operation
		map.put("Ashif", 1);
		map.put("Ashraf", 2);
		map.put("Ammaji", 3);
		map.put("Ashika", 4);
		map.put("Chand Basha", 5);
		System.out.println(map);
		// cRud Read Operations
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
		System.out.println("Iterating over a Key Set");
		Set<String> keySet = map.keySet();
		for(String str: keySet) {
			System.out.println("key: " + str + " Value: " +  map.get(str));
		}
		
		// crUd Update Operation
		System.out.println("Update Operation");
		map.put("Ashif", 2);
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
		
		// putIfAbsent, Contains, IsEmpty, Size, values, keySet 
		map.putIfAbsent("Ashif", 1); // put if key is absent. if key is present values are not updated
		System.out.println(map);
		map.putIfAbsent("Ashiff", 6);
		System.out.println(map);
		System.out.println(map.containsKey("Ashif"));
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
	}
}
