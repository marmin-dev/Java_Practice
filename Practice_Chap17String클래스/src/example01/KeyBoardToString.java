package example01;

import java.io.IOException;

public class KeyBoardToString {

	public static void main(String[] args) {
		
		byte[] bytes = new byte[100];
		//System.out.println(bytes[99]);
		
		System.out.print("�Է� : ");
		int readBytesNo=0;
		
		try {
			//���ڼ� EUC-KR�� ���ڵ�
			readBytesNo = System.in.read(bytes);
			//Ű����� ���� ǥ���Է����ް� �� ������ ����Ʈ�� �������ϰ�
			//�Է¹��� ����Ʈ ���������Ѵ�
			String str = new String(bytes, 0, readBytesNo-2, "EUC-KR");
			System.out.println(str);
			System.out.println("�Է¹��� ����Ʈ��: " + readBytesNo);
			//EUC - Kr : �ѱ� 2����Ʈ, UTF-8������ 3����Ʈ�̴�
			byte[] b = str.getBytes("EUC-KR");
			System.out.println(b.length);
			
			byte[] b2 ="�ȳ��ϼ���".getBytes();
			System.out.println(b2.length);
			//���ڵ��� ���ڵ��� �������� �ݵ�� ���ڼ��� �����ϰ� �������� ���ڰ� ������
			//�ϴ� ������ �����Ҽ��ִ�
		} catch (IOException e) {
		
		}

	}

}
