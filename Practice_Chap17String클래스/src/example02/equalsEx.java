package example02;

public class equalsEx {

	public static void main(String[] args) {
		String str1 = new String("���ȯ");
		String str2 = "���ȯ";
		String str3 = "���ȯ";//���ͷ� Ÿ������ ����
		
		// ==�����ڰ� �ּҺ�
		if(str1==str2) {
			System.out.println("���� ������ �ν��Ͻ�");
		}
		else {
			System.out.println("�ٸ� ������ �ν��Ͻ�");
		}
		//���� ���ͷ��� ���
		if(str2==str3) {
			System.out.println("���� ������ �ν��Ͻ�");
		}
		else {
			System.out.println("�ٸ� ������ �ν��Ͻ�");
		}
		
		//String�� equals() ���� (ObjectŬ������ equals()�������̵�)
		if(str1.equals(str2)) {
			System.out.println("���� ���ڿ��Դϴ�");
		}
		else {
			System.out.println("�ٸ� ���ڿ��Դϴ�");
		}
		if(str2.equals(str3)) {
			System.out.println("���� ���ڿ��Դϴ�");
		}
		else {
			System.out.println("�ٸ� ���ڿ��Դϴ�");
		}
	}

}
