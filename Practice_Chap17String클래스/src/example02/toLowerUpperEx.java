package example02;

public class toLowerUpperEx {

	public static void main(String[] args) {
		
		String str1 ="Java Programming";
		String str2 ="JAVA Programming";
		
		System.out.println("�빮�� : " + str1.toUpperCase());
		System.out.println("�ҹ��� : " + str1.toLowerCase());
		
		System.out.println(str1.equals(str2));
		//equalsIgnoreCase�� ��ҹ��ڸ��������ʴ´�
		System.out.println(str1.equalsIgnoreCase(str2));
		

	}

}
