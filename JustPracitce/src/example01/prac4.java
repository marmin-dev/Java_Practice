package example01;

import java.util.Scanner;

public class prac4 {

	public static void main(String[] args) {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int num = sc.nextInt();
		for(int i =1;i<=num;i++) {
			for(int j=0;j<i;j++) {
				if(i%j==0)
					result += j;
			}
			if(i==result) {
			System.out.println(i);
			}
		}
		sc.close();
	}
}
