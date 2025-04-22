package streams1;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args){
		String[] names = {"Ashif", "Ashraf", "Ashika", "Chand Basha"};
		Arrays.stream(names)
			  .filter(name -> name.startsWith("A"))
			  .map(name -> new StringBuilder(name).reverse().toString())
			  .forEach(System.out::println);
	}

}
