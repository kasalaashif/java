package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDeepDive {
	
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		
		//Crud Create Operation
		set.add("Ashif");
		set.add("Ashraf");
		set.add("Ammaji");
		set.add("Ashika");
		set.add("Ashif");
		
		System.out.println(set);
		
		// cRud Reading Operation
		for(String str: set) {
			System.out.println(str);
		}
		
		// crUd Update Operation
		// No update Operation
		
		// cruD delete Operation
		set.remove("Ashif");
		set.removeAll(set);
		set.clear();
		
		// Contains
		System.out.println(set.contains("Ashif"));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
	}

}
