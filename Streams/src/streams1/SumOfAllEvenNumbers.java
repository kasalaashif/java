package streams1;

import java.util.Arrays;

public class SumOfAllEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[100];
		for(int i = 0; i < 100; i++)
			nums[i] = i;
		
		int sum = Arrays.stream(nums)
		      .filter(n -> n % 2 == 0)
		      .sum();
		System.out.println(sum);
	}

}
