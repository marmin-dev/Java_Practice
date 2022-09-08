package example02;

public class ReplaceEx {

	public static void main(String[] args) {
		
		//replace()는 문자열 대체하는 메서드이다.
		String oldstr = "자바는 객체지향언어입니다.";
		String newstr = oldstr.replace("자바", "java");
		System.out.println(newstr);
		//새로운 인스턴스를 만든다
		
		System.out.println(newstr.toString());
		
		System.out.println(oldstr.hashCode());
		System.out.println(newstr.hashCode());
		
	}

}
