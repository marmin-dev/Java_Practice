package example02;

import java.util.Scanner;

public class Inputgugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단을 출력할까요? : ");
		int num = sc.nextInt();
		for(int i = 2;i<=num;i++ )
		{
			System.out.println(i + "단");
			for(int j = 2; j<=num; j++)
			{
				System.out.println(i + "x" + j + "=" + (i*j));
			}
		}
		sc.close();
	}

}
