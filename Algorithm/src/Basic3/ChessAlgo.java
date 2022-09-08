package Basic3;

import java.util.Arrays;
import java.util.Scanner;

public class ChessAlgo {

	public static void main(String[] args) {
		
		int[] arrFull = {1,1,2,2,2,8};
		int[] arr = new int[6];
		int[] arr1 = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
		}
		for(int k=0; k<arr.length;k++) {
			arr1[k] = arrFull[k] - arr[k];
		}
		System.out.println(Arrays.toString(arr1));
		

	}

}
