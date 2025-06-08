package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment {

	public static void main(String[] args) {
		
		//Create an empty list of student names
		List<String> studentNames = new ArrayList<>();
		
		// Add at least 5 names to the list (use add() and add(index, name))
		studentNames.add("Ashif");
		studentNames.add(0, "Ashraf");
		studentNames.add("Chand Basha");
		// Insert a name at the beginning of the list
		studentNames.add(0, "Ammaji");
		studentNames.add(0, "Ashika");
		
		System.out.println(studentNames);
		
		// Update the 3rd student’s name to fix a typo (use set(index, name))
		studentNames.set(2, "Kasala Ashraf");
		
		System.out.println(studentNames);
		// Remove a student by name and by index (use both remove() versions)
		studentNames.remove("Kasala Ashraf");
		studentNames.remove(3);
		
		System.out.println(studentNames);
		
		// Check if "Alice" is in the list (use contains())
		System.out.println(studentNames.contains("Alice"));
		
		//Print the index of "Bob" (use indexOf())
		System.out.println(studentNames.indexOf("Bob"));
		System.out.println(studentNames.indexOf("Ashif"));
		
		// Print the total number of students (use size())
		System.out.println(studentNames.size());
		
		// Use a for-each loop to print all students
		for(String student: studentNames) {
			System.out.println(student);
		}
		
		// Sort the list alphabetically
		Collections.sort(studentNames);
		System.out.println(studentNames);
		
		// Reverse the list
		Collections.reverse(studentNames);
		System.out.println(studentNames);
		
		// Clear the list and verify it's empty (use clear() and isEmpty())
		studentNames.removeAll(studentNames);
		studentNames.clear();
		
		System.out.println(studentNames.isEmpty());
	}

}
