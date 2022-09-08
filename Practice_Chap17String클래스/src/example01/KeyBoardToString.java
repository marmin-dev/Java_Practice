package example01;

import java.io.IOException;

public class KeyBoardToString {

	public static void main(String[] args) {
		
		byte[] bytes = new byte[100];
		//System.out.println(bytes[99]);
		
		System.out.print("입력 : ");
		int readBytesNo=0;
		
		try {
			//문자셋 EUC-KR로 디코딩
			readBytesNo = System.in.read(bytes);
			//키보드로 부터 표준입력을받고 그 내용을 바이트에 저장을하고
			//입력받은 바이트 수를리턴한다
			String str = new String(bytes, 0, readBytesNo-2, "EUC-KR");
			System.out.println(str);
			System.out.println("입력받은 바이트수: " + readBytesNo);
			//EUC - Kr : 한글 2바이트, UTF-8에서는 3바이트이다
			byte[] b = str.getBytes("EUC-KR");
			System.out.println(b.length);
			
			byte[] b2 ="안녕하세요".getBytes();
			System.out.println(b2.length);
			//인코딩과 디코딩의 과정에서 반드시 문자셋은 동일하게 가져가야 글자가 꺠지건
			//하는 오류를 방지할수있다
		} catch (IOException e) {
		
		}

	}

}
