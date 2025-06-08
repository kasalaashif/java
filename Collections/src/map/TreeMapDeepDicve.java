package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDeepDicve {
	
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		//Crud Create Operations
		treeMap.put("Ashif", 1);
		treeMap.put("Ashraf", 2);
		treeMap.put("Ashika", 3);
		treeMap.put("Chand Basha", 4);
		
		// cRud Reading Operations
		for(Map.Entry<String, Integer> entry: treeMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
		
		System.out.println(treeMap.get("Ashif") + " get Ashif");
		
		// crUd Update Operations
		treeMap.put("Ashif", 5);
		System.out.println("Update Operation");
		for(Map.Entry<String, Integer> entry: treeMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
		
		// IsEmpty & Contains & KeySet * values
		System.out.println(treeMap.isEmpty());
		System.out.println(treeMap.containsKey("Ashif"));
		System.out.println(treeMap.containsValue(1));
		System.out.println(treeMap.keySet());
		System.out.println(treeMap.values());
		
		// getOrDefault, putIfempty
		treeMap.putIfAbsent("Ammaji", 1);
		System.out.println(treeMap.getOrDefault("Ashif", 0));
		System.out.println(treeMap.getOrDefault("Ashiff", 0));
	}
}
