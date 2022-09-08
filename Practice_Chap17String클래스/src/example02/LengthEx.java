package example02;

public class LengthEx {

	public static void main(String[] args) {
		
		String phonenum="01045671234";
		System.out.println("문자열의 길이 : "+phonenum.length());
		
		int length = phonenum.length();
		
		if(length == 11) {
			System.out.println("폰 번호 자리가 맞습니다");
		}
		else {
			System.out.println("다시 입력해주세요");
		}

	}

}
