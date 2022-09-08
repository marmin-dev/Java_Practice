package Basic1;

import java.util.Arrays;

public class Primenum {
	static public void main(String[] args) {
		final int ARR_LEN = 10;
		int num=0;
		int[] arr = new int[ARR_LEN];
		for(int i = 0;i<ARR_LEN;i++) {
			num = (int)(Math.random()*8)+1;
			if(num==1) {
				i=0;
				continue;
			}
			if(num==2) {
				arr[i]=num;
				continue;
			}
			for(int j=2;j*j<num;j++) {
				if(num%j!=0) {
					arr[i]=num;
				}
				else if(num%j==0) {
					i=0;
					num=0;
					continue;
				}
			}
			if(num==0) {
				i=0;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
	}
}
