package streams1;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindTheFirstElementGreaterThan100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[10];
		
		for(int i = 97; i < 107; i++)
			nums[i - 97] = i;
		
		OptionalInt number = Arrays.stream(nums)
		      .filter(num -> num > 100)
		      .sorted()
		      .findFirst();
		number.ifPresent(System.out::println);
	}

}
