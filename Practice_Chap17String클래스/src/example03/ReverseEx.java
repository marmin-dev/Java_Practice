package example03;

public class ReverseEx {

	public static void main(String[] args) {
		
		String str = "�ȳ��ϼ���";
		String reverse = "";
		int count = 0;
		
		String r = reverseString(str);
		System.out.println();
		System.out.println(r);
		count = str.length();
		System.out.println("���ڿ� ���� : "+ count);
		for(int i = 0 ; i<count;i++) {
			reverse += str.charAt(count - (i+1));
			System.out.println(reverse);
		}
		System.out.println("reverse : " +reverse);

	}
	public static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
		//�ӽø޸� ���۸� �̿��ϱ⶧���� ����ü������ �������� �ٷν�Ű�� 
		//�ν��Ͻ��� ������ �ϳ��̴�
	}

}
