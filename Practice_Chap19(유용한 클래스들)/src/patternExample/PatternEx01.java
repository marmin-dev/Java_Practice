package patternExample;

import java.util.regex.Pattern;

public class PatternEx01 {

	public static void main(String[] args) {
		//010,02로 시작하는 휴대폰 번호나 서울지역 전화번호를 패턴으로 정의
		String pattern = "(010|02)-\\d{3,4}-\\d{4}";
		String phonenum = "010-3268-3222";
		String seoulnum = "02-3268-3222";
		
		
		boolean result =  Pattern.matches(pattern, seoulnum);
		if(result) {
			System.out.println("전화번호이다");
		}
		else {
			System.out.println("전화번호 양식이 맞지 않습니다");
		}
		//이메일 양식을 검증하는 방법
		String email = "\\w+@\\w+\\.\\w+(\\.\\w+)*";
		String emailData = "dksk@naver.com";
		String email2 = "dksk@email.daelim.ac.kr";
		
		boolean emailRe = Pattern.matches(email, email2);
		if(emailRe) {
			System.out.println("email이다");
		}
		else {
			System.out.println("email 양식이 맞지 않습니다");
		}
	}

}
