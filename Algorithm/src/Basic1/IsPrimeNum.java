package Basic1;

import java.util.Arrays;

public class IsPrimeNum {
	public static void main(String[] args) {
		final int ARR_LENGTH =10;
		int[] arr = new int[ARR_LENGTH];
		for(int i =0; i<arr.length;i++) {
			boolean isPr = true;
			int randval = (int)(Math.random()%8)+1;
			if(randval==1) {
				continue;
			}
			if(randval==2) {
				arr[i] = randval;
				continue;
			}
			for(int j =2;j<randval;j++) {
				if(randval%j==0) {
					isPr = false;
					break;
				}
			}
			if(isPr) {
				arr[i]=randval;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

