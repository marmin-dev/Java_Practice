package example01;

import java.util.Scanner;

public class IfNestedEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요");
		int score = sc.nextInt();
		
		if(score >= 90)
		{
			if(score>=95)
			{
				System.out.println("A+등급입니다");
			}
			else
			{
			System.out.println("A0등급입니다");
			}
		}
		else if(score >= 80)
		{
			if(score>=85)
			{
				System.out.println("B+등급입니다");
			}
			else
			{
			System.out.println("B0등급입니다");
			}
		}
		else if(score >= 70)
		{
			if(score>=75)
			{
				System.out.println("C+등급입니다");
			}
			else
			{
			System.out.println("C0등급입니다");
			}
			
	
		}
		else
		{
			System.out.println("D등급입니다");
		}
		sc.close();
	}

}
