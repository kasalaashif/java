package streams1;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Ashif", "Ashraf", "Ashika", "Chand", "King", "Ashif", "Ashraf");
		
		names.stream()
			 .distinct()
			 .forEach(System.out::println);
		
	}

}
