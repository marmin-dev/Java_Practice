package example02;

public class toLowerUpperEx {

	public static void main(String[] args) {
		
		String str1 ="Java Programming";
		String str2 ="JAVA Programming";
		
		System.out.println("대문자 : " + str1.toUpperCase());
		System.out.println("소문자 : " + str1.toLowerCase());
		
		System.out.println(str1.equals(str2));
		//equalsIgnoreCase는 대소문자를비교하지않는다
		System.out.println(str1.equalsIgnoreCase(str2));
		

	}

}
