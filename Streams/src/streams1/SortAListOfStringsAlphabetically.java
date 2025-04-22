package streams1;

import java.util.Arrays;
import java.util.List;

public class SortAListOfStringsAlphabetically {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ashif", "Ashraf", "Ashika", "Chand", "King");
		names.stream()
			 .sorted()
			 .forEach(System.out::println);
	}
}
