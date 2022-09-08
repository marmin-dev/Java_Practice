package example02;

public class GetBytesEx {

	public static void main(String[] args) throws Exception {
		
		String str = "�ȳ��ϼ���";
		
		//���ڵ�(��谡 �˾ƺ��� ���ϰ� ��ȯ�ϴ� ����)
		byte[] bytes1 = str.getBytes("EUC-KR");
		System.out.println("bytes1(EUC-KR)�� ����"+bytes1.length);
		
		byte[] bytes2 = str.getBytes("UTF-8");
		System.out.println("bytes1(EUC-KR)�� ����"+bytes2.length);
		
		String str1 = new String(bytes1,"EUC-KR");
		System.out.println("EUC-KR�� ���ڵ��� ���ڿ�" + str1);
		
		String str2 = new String(bytes2,"UTF-8");
		System.out.println("EUC-KR�� ���ڵ��� ���ڿ�" + str2);
		
		
		
		
	}

}
