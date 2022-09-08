package Basic3;

import java.util.Arrays;

public class exam03 {

	public static void main(String[] args) {
		int[] arr1 = {1,3,2};
		int[] arr2 = {2,3,1};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean eq = Arrays.equals(arr1, arr2);
		System.out.println(eq);
		
		
	}

}
