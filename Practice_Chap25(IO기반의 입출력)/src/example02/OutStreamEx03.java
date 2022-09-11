package example02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutStreamEx03 {

	public static void main(String[] args) throws Exception {
		
		OutputStream oStream = new FileOutputStream("/Users/marmin/Documents/write1.txt");
		byte[] data = "ABC이순신장군님".getBytes("UTF-8");
		System.out.println("바이트 배열의 크기 " + data.length);
		oStream.write(data, 3, 18);//시작인덱스가 3이고 16개의 길이만큼 내보낸다
		oStream.flush();
		System.out.println("파일이 저장되었습니다");
		
		
		
		
		
		oStream.close();
		
		
	}

}
