package example02;

public class LengthEx {

	public static void main(String[] args) {
		
		String phonenum="01045671234";
		System.out.println("���ڿ��� ���� : "+phonenum.length());
		
		int length = phonenum.length();
		
		if(length == 11) {
			System.out.println("�� ��ȣ �ڸ��� �½��ϴ�");
		}
		else {
			System.out.println("�ٽ� �Է����ּ���");
		}

	}

}
