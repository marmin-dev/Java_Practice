package example05;

import java.util.Arrays;
import java.util.Scanner;

public class math03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = {0,0,0,0,0,0};
		for(int i = 0; i<6; i++) {
			s[i] = sc.nextInt();
		}
		int temp=0;
		int temp2=0;
		int m = 0,n=0,t =0;
		int j=0;
		Arrays.sort(s);
		for(j=0;j<4;j++) {
			temp=(s[j+1]-s[j]);
			for(int k=1;k<5;k++) {
				temp2 =(s[k+1]-s[k]);
				if(temp2>temp) {
					m=temp;
				}
				else if(m>temp) {
					m=temp;
					n=s[j+1];
					t=s[j];
				}
			}
			
		}
		System.out.println(t+","+n);
		
	}

}
