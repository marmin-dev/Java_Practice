package example01;

import java.util.Scanner;

public class prac3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = (int)(Math.random()*100) + 1;
		int cnt = 0;
		int userIn =0;
		boolean end = true;
		do {
			System.out.print("1~100까지의 숫자를 입력하세요 : ");
			userIn = sc.nextInt();
			if(ans == userIn && userIn<=100){
				System.out.println("정답입니다!");
				cnt++;
				end=false;
			}
			else if(ans>userIn && userIn<=100){
				System.out.println("더 높은 숫자를 입력하세요");
				cnt++;
			}
			else if(ans<userIn && userIn<=100){
				System.out.println("더 작은 숫자를 입력하세요");
				cnt++;
			}
			else{
				System.out.println("잘못된 값입니다");
				continue;
			}
		}while(end);
System.out.println("당신은 " + cnt + "번 만에 성공하셨습니다.");
sc.close();
	}

}
