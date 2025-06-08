package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//String
		//create an ArrayList
		List<String> stringList = new ArrayList<>();
		
		stringList.add("Ashif");
		stringList.add("Ashraf");
		System.out.println(stringList);
		
		// Integer
		List<Integer> integerList = new ArrayList<>();
		
		integerList.add(100);
		integerList.add(100);	
		System.out.println(integerList);
		
		// Adding List of List
		List<List<String>> combinedList = new ArrayList<>();
		combinedList.add(stringList);
		
		// Convert Int to String 
		List<String> intToStringList = new ArrayList<>();
		for(Integer i : integerList)
			intToStringList.add(i.toString());
		
		combinedList.add(intToStringList);
		
		// Traversing over the list of the list
		for(List<String> list: combinedList) {
			for(String str: list) {
				System.out.println(str);
			}
		}
		
		// Convert String to Integer
		int i = Integer.parseInt(combinedList.get(1).get(0));
		System.out.println(i);
		
		
	}

}
