package example02;

public class TrimEx {

	public static void main(String[] args) {
		//���̵� �н����� â���� ����Ѵ� �յڰ������ŵ�����
		//nextLine().trim();�̷������� ����Ѵ�
		//trim = �¿���鸸 �����ϰ� �߰��� �ִ� ������ ���α׷��Ӱ� ����
		//�����ϴ� �ڵ带 �ۼ��ؾ��Ѵ�
		
		
		String tel1 = "             02";
		String tel2 = "-772   ";
		String tel3 = "            -1032";
		
		System.out.println(tel1.trim()+tel2.trim()+tel3.trim());

	}

}
