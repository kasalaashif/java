package streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectArrayNamesToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Ashif", "Ashraf", "Ashika", "Chand"};
		List<String> list = Arrays.stream(names)
								  .collect(Collectors.toList());
		
		list.forEach(System.out::println);
	}

}
