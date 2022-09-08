package example02;

public class TrimEx {

	public static void main(String[] args) {
		//아이디 패스워드 창에서 사용한다 앞뒤공백제거등으로
		//nextLine().trim();이런식으로 사용한다
		//trim = 좌우공백만 제거하고 중간에 있는 공백은 프로그래머가 직접
		//제거하는 코드를 작성해야한다
		
		
		String tel1 = "             02";
		String tel2 = "-772   ";
		String tel3 = "            -1032";
		
		System.out.println(tel1.trim()+tel2.trim()+tel3.trim());

	}

}
