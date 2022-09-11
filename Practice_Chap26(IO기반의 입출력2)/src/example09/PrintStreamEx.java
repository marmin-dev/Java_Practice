package example09;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {

	public static void main(String[] args) throws Exception {
		
		File file = new File("/Users/marmin/printstream.txt");
		FileOutputStream fOutputStream = new FileOutputStream(file);
		//보조스트림 중에서 개행이 빈번하게 일어날경우 사용하면 좋다
		PrintStream pStream = new PrintStream(file);
		
		//파일에 출력을 한다. 출력스트림이라 System.out(콘솔)해서 사용해도 된다
		pStream.println("프린트 스트림 사용");
		pStream.println("나는");
		pStream.println("자바프로그램으로");
		pStream.println("프린터가 출력하는 것처럼");
		pStream.println("프로그램을 만들어서 데이터를 출력한다 이말이에요");
		
		System.out.println("파일 저장 완료");
		//c언어 기억나지
		System.out.printf("%d %d %d",10,20,30);
		
		pStream.flush();
		pStream.close();
		fOutputStream.close();

	}

}
