package example02;

public class ReplaceEx {

	public static void main(String[] args) {
		
		//replace()�� ���ڿ� ��ü�ϴ� �޼����̴�.
		String oldstr = "�ڹٴ� ��ü�������Դϴ�.";
		String newstr = oldstr.replace("�ڹ�", "java");
		System.out.println(newstr);
		//���ο� �ν��Ͻ��� �����
		
		System.out.println(newstr.toString());
		
		System.out.println(oldstr.hashCode());
		System.out.println(newstr.hashCode());
		
	}

}
