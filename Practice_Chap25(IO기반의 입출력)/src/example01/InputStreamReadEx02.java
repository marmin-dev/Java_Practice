package example01;

import java.io.FileInputStream;
import java.io.InputStream;


public class InputStreamReadEx02 {

	public static void main(String[] args) throws Exception{
		InputStream iStream = new FileInputStream("/Users/marmin/Documents/test.txt");
		int readByteNo;
		int i = 0;
		byte[] b = new byte[3];
		
		while((readByteNo =iStream.read(b)) != -1) {
			System.out.println("읽은 바이트 수 : "+readByteNo);
			String str = (new String(b));
			
			System.out.println("읽은 문자 : " + (new String(str.getBytes(),"UTF-8")));
			
		}
		iStream.close();
	}

}
