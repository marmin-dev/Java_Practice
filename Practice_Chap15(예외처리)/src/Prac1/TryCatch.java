package Prac1;

import java.util.Arrays;

public class TryCatch {

	public static void main(String[] args) {
	int[] arr = new int[3];
	try {
		arr[0] =1;
		arr[2] =1;
		arr[3] =1;
		arr[4] =1;
	}catch(Exception e){
		System.out.println("이게 말이되냐");
	}
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	
	
}
}
