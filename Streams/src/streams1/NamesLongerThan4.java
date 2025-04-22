package streams1;

import java.util.Arrays;

public class NamesLongerThan4 {
	public static void main(String[] args) {
		String[] names = {"Ashif", "Ashraf", "Ashika", "Chan", "Ammu"};
		Arrays.stream(names)
			  .filter(name -> name.length() > 4)
			  .map(String::toLowerCase)
			  .forEach(System.out::println);
	}
}
