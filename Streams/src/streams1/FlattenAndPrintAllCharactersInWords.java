package streams1;

import java.util.Arrays;

public class FlattenAndPrintAllCharactersInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"Ashif", "Ashraf", "Chand Basha", "Ammaji"};
		
		Arrays.stream(words)
			  .flatMap(word -> word.chars().mapToObj(c -> (char)c))
			  .forEach(System.out::print);
	}
	

}
