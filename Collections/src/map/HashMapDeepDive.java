package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDeepDive {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		// Crud Create Operation
		map.put("Ashif", 1);
		map.put("Ashraf", 2);
		map.put("Ashika", 3);
		
		System.out.println(map);
		
		// cRud read Operation
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
		
		// crUd Update Operation
		map.put("Ashif", 4);
		System.out.println("After Update: ");
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
		}
		
		// cruD Delete Operation
		
		map.remove("Ashif");
		System.out.println("After Delete: ");
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
		
		// Contains & Size & isEmpty & Keys & Values
		System.out.println("Contains: " + map.containsKey("Ashraf"));
		System.out.println("isEmpty: " + map.isEmpty());
		System.out.println("Keys: " + map.keySet());
		System.out.println("values: " + map.values());
	}
}
