package example02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File_CopyEx {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fiStream = new FileInputStream("/Users/marmin/Documents/write1.txt");
		FileOutputStream foStream = new FileOutputStream("/Users/marmin/Documents/write1복사본.txt");
		byte[] readBytes = new byte[1000];
		//이거 맥에선 좀빡센거같은데?
		
		int data = 0;
		while((data = fiStream.read(readBytes))!=-1) {
			data = fiStream.read(readBytes);
			foStream.write(readBytes);
			System.out.println("읽은 바이트수 : " + data);
		}
		foStream.close();
		System.out.println("복사본 생성완료!");
		
		fiStream.close();
		foStream.close();
		

	}

}
