package example04;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료시키려면, q를 입력하세요");
		String str = null;
		//이유는 조건문이 뒷부분에 존재하기 때문이다
		do {
			
			System.out.println(">");
			//str = sc.next();
			str =sc.nextLine();
			System.out.println("입력받은 메세지 : " + str);
			
		}while(!str.equals("q"));
		
		
		
		System.out.println("프로그램 종료");
		sc.close();

	}

}
