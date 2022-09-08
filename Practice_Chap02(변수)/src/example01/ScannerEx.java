package example01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		//커맨드 쉬프트 o 
		Scanner sc = new Scanner(System.in);
		//스캐너 클래스는 입력을 받기 위한 클래스이고, 입력스트림이다
		//자원(resource)는 사용하고나서 반드시 닫아줘야 한다.
		/*
		 * System.out.print("정수 한자리를 입력하세요 : "); int num = sc.nextInt();
		 * System.out.println("사용자로 부터 입력받은 숫자 : "+num); //입력스트림을 이용하는 방법
		 * System.out.print("실수 한자리를 입력하세요 : "); Double dnum = sc.nextDouble();
		 * System.out.println("사용자로 부터 입력받은 숫자 : "+dnum);
		 */	
		
		 System.out.print("문자열을 입력하세요 : "); //String str = sc.nextLine();
		 // System.out.println("사용자로 부터 입력받은 문자열 : " + str);
		 
		//nextLine()은 문자열을 입력받는다 
		//next()는 공백을 기준으로 해서 문자를 입력 -- 단어를 입력시 유리
		//엔더키를 입력받을때 까지 문자열 입력을받는다
		//숫자로 바꿔서 문자열을 받을때쓰고싶다!
	int result = 100;
	String num = sc.nextLine();
	int temp =Integer.parseInt(num);
	int total= result + temp;
	System.out.println("연산결과:" +total);
	sc.close();
	}

}
