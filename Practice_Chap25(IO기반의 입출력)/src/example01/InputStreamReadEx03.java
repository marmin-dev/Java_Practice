package example01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamReadEx03 {
	
	public static void main(String[] args) throws Exception {
		
		InputStream iStream = new FileInputStream("/Users/marmin/Documents/test.txt");
		int count;
		byte[] readBytes = new byte[10];
		//시작인덱스가 2이고 3개만 할당하여 저장하는 코드
		count = iStream.read(readBytes,2,5);
		System.out.println("읽은 바이트 수 : " + count);
		System.out.println();
		for(byte b:readBytes) {
			System.out.println("읽은 바이트 : " + (char)b);
		}
		//읽은 바이트 수는 5다
		
		
		
		
		
		iStream.close();
	}
}
