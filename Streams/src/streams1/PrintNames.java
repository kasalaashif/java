package streams1;

import java.util.Arrays;
import java.util.List;

public class PrintNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Ashif", "Ashraf", "Ashika", "Chand Basha");
		
		list.stream()
			.filter(name -> name.startsWith("A"))
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
	}

}
