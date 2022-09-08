package example01;

import java.util.Scanner;

public class ElseifElseEx {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("점수를 입력해주세요 : ");
	int score = sc.nextInt();
	
		//score 변수의 값에 따라서 아래 조건문에서 분기가 일어나고 있는 점을
		//이 예제의 핵심으로 본다.
		if(score >= 90) {
			System.out.println("점수가 90점 이상입니다.");
			System.out.println("등급은 A입니다");
		}
		else if(score >=80 && score<90) {
			System.out.println("점수가 80~90점 사입니다.");
			System.out.println("등급은 B입니다");
		}
		else if(score >=70 && score<80) {
			System.out.println("점수가 70~80점 사입니다.");
			System.out.println("등급은 C입니다");
		}
		else {
			System.out.println("아웃!");
		}
		sc.close();
	}

}
