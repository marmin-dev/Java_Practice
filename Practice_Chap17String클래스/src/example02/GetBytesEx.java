package example02;

public class GetBytesEx {

	public static void main(String[] args) throws Exception {
		
		String str = "안녕하세요";
		
		//인코딩(기계가 알아보기 편하게 변환하는 과정)
		byte[] bytes1 = str.getBytes("EUC-KR");
		System.out.println("bytes1(EUC-KR)의 길이"+bytes1.length);
		
		byte[] bytes2 = str.getBytes("UTF-8");
		System.out.println("bytes1(EUC-KR)의 길이"+bytes2.length);
		
		String str1 = new String(bytes1,"EUC-KR");
		System.out.println("EUC-KR로 디코딩한 문자열" + str1);
		
		String str2 = new String(bytes2,"UTF-8");
		System.out.println("EUC-KR로 디코딩한 문자열" + str2);
		
		
		
		
	}

}
