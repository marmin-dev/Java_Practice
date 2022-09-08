package Basic1;

import java.util.Arrays;

public class RandPrimeNumb {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int num = 0;
		for(int i=0;i*i<arr.length;i++) {
			num=(int)(Math.random()*arr.length)+1;
			if(num==1) {
				continue;
			}
			if(num==2) {
				arr[i]=num;
				continue;
			}
			
			for(int j=2;j<num;j++) {
				if(num%j==0) {
					break;
				}
				else if(num%j!=0) {
					arr[i]=num;
				}
			}
			if(arr[i]==0) {
				i=0;
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}//왜 9가 계속 걸릴까..
