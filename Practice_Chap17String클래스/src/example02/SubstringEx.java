package example02;

public class SubstringEx {

	public static void main(String[] args) {
		String phoneNum ="01012347890";
		//subString()문자열을 잘라내어 String 으로 반환
		String str1 = phoneNum.substring(3);
		System.out.println(str1);
		
		String str2 = phoneNum.substring(0, 3);
		System.out.println(str2);//마지막 인덱스는 미포함된다
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

	}

}
