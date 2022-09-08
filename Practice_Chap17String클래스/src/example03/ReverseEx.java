package example03;

public class ReverseEx {

	public static void main(String[] args) {
		
		String str = "안녕하세요";
		String reverse = "";
		int count = 0;
		
		String r = reverseString(str);
		System.out.println();
		System.out.println(r);
		count = str.length();
		System.out.println("문자열 길이 : "+ count);
		for(int i = 0 ; i<count;i++) {
			reverse += str.charAt(count - (i+1));
			System.out.println(reverse);
		}
		System.out.println("reverse : " +reverse);

	}
	public static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
		//임시메모리 버퍼를 이용하기때문에 그자체내에서 리버스를 바로시키고 
		//인스턴스가 무조건 하나이다
	}

}
