package example02;

public class SubstringEx {

	public static void main(String[] args) {
		String phoneNum ="01012347890";
		//subString()���ڿ��� �߶󳻾� String ���� ��ȯ
		String str1 = phoneNum.substring(3);
		System.out.println(str1);
		
		String str2 = phoneNum.substring(0, 3);
		System.out.println(str2);//������ �ε����� �����Եȴ�
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

	}

}
