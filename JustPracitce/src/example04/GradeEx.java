package example04;

import java.util.Scanner;

public class GradeEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수학,과학,영어 점수를 순서대로 입력해주세요");
		int math =sc.nextInt();
		int science =sc.nextInt();
		int english =sc.nextInt();
		Grade gr = new Grade(math,science,english);
		System.out.println("당신의 평균은? : "+gr.avgCal());

	}

}
