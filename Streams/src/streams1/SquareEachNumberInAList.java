package streams1;

import java.util.ArrayList;
import java.util.List;

public class SquareEachNumberInAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i < 10; i++)
			list.add(i);
		list.stream()
			.map(i -> i * i)
			.forEach(System.out::println);

	}

}
