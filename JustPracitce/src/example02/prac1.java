package example02;

import java.util.Scanner;

public class prac1 {
	
	public static void main(String[] args) {
	//삼항연산자에 대해 알아보자
	Scanner sc = new Scanner(System.in);
	System.out.print("점수를 입력해주세요");
	char grade = 'A';
	int score =sc.nextInt();
	grade = (score > 90)? 'A' : 'B';
	System.out.println(grade);
		
		
		
	sc.close();	
	}

}
