package Basic3;

import java.util.Arrays;

public class exam04 {
	public static void main(String[] args) {
		int[] arr = {5,10,9,27,2,8,10,4,27,1};
		int[] result = new int[10];
		int overlap = 0;
		for(int i =0;i<arr.length;i++) {
			
			for(int j = i+1;i<arr.length;i++) {
				if(arr[i]==arr[j]) {
					arr[j]=0;
					arr[i]=arr[j];
				}
			}
		result = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(result));
		}
	}
}
