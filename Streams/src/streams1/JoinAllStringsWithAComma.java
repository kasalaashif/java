package streams1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinAllStringsWithAComma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Ashif", "Ashraf", "Ashika", "Chand", "King"};
		
		String joinedName = Arrays.stream(names)
		      .collect(Collectors.joining(", "));
		System.out.println(joinedName);
	}

}
