package example02;

import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] answer= {0,0,0}; // 컴퓨터의 정답
		int[] userIn= {0,0,0}; // 유저의 인풋
		int cnt1=0,cnt2=0;
		//컴퓨터의 랜덤숫자 발급
		System.out.println("컴퓨터가 랜덤숫자를 발급합니다");
		for(int i=0;i<answer.length;i++) {
			answer[i]=(int)(Math.random()%9)+1;
		}
		System.out.println("1~9까지의 숫자 3개를 한개씩 입력해주세요");
		//유저가 숫자를입력
		for(int i=0;i<answer.length;i++) {
			userIn[i]=sc.nextInt();
			if(userIn[i] > 9)
			{
				System.out.println("숫자를 다시 입력해주세요");
			}
		}
		//정답 검사하는 반복문
		for(int i=0;i<answer.length;i++) {
			
		}
		
		
		

	}

}
