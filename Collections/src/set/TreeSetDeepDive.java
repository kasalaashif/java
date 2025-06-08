package set;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDeepDive {

	public static void main(String[] args) {
		//Set<String> set = new TreeSet<>(Collections.reverseOrder());
		Set<String> set = new TreeSet<>();
		// Crud Create Operation
		set.add("Ashif");
		set.add("Ashraf");
		set.add("Ammaji");
		set.add("Ashika");
		set.add("Ashif");
		
		System.out.println(set);
		
		set.addAll(set);
		System.out.println(set);
		
		// cRud Read Operation
		for(String str: set) {
			System.out.println(str);
		}
		
		
		// crUd Update Operation
		// No update Operation
		
		// cruD Delete Operation
		
		set.remove("Ashif");
		System.out.println(set);
		set.removeAll(set);
		System.out.println(set);
		set.clear();
		System.out.println(set);
	}

}
