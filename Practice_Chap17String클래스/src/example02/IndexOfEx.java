package example02;

public class IndexOfEx {

	public static void main(String[] args) {
		
		//indexOf�޼���� ã�� ����� �Ҷ�, ���� ���δ�(������)
		String str = "������ �ڹٰ� �ϰ� ���� ���̳׿�";
		int index =str.indexOf("�ڹ�");
		System.out.println(index);
		//�ڹٶ�� ���ڿ��� ���ԵǾ� ������..
		if(str.indexOf("�ڹ�")!=-1) {
			System.out.println("�ڹٿ� ���õ� �����̱�");
		}
		else {
			System.out.println("�ڹٰ� �ϰ���� �ʱ�");
		}

	}

}
