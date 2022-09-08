package example03;

import java.util.Scanner;

public class Sum3_5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num1 = sc.nextInt();
		int sum=0;
		int num2 = 0;
		for(int i=1;i < num1;i++)
		{
			if((i%3)==0 ||(i%5)==0)
			{
				num2 = i;
			}
			else {
				continue;
			}
			sum += num2;
		}
		System.out.printf("자연수 %d까지의 3,5의 배수의 총합은 %d입니다.",num1,sum);
		sc.close();
		

	}

}
