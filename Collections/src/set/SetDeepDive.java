package set;

import java.util.HashSet;
import java.util.Set;

public class SetDeepDive {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		//Crud Create Operation
		set.add("Ashif");
		set.add("Ashraf");
		set.add("Ammaji");
		set.add("Ashika");
		set.add("Ashif");
		
		System.out.println(set);
		
		set.addAll(set);
		System.out.println(set);
		
		// cRud Read Operations
		System.out.println(set.contains("Ashif"));
		// To read -- we need to iterate over the set
		for(String str: set) {
			System.out.println(str);
		}
		
		// crUd Update Operation
		// there is no update operation
		
		
		// cruD Delete operation
		set.remove("Ashif");
		System.out.println(set);
		set.clear();
		System.out.println(set);
		set.removeAll(set);
		System.out.println(set);
	
	}

}
