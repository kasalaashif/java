package streams1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class FindTheLongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"Ashif", "Ashraf", "Chand Basha", "Ammaji"};
		
		Optional<String> LongestWord = Arrays.stream(words)
		      .sorted(Comparator.comparing(String::length).reversed())
		      .findFirst();
		LongestWord.ifPresent(System.out::println);
	}

}
