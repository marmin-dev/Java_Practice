package example07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx {

	public static void main(String[] args) throws Exception{
		
		File file = new File("/Users/marmin/eclipse-workspace/Practice_Chap26(IO기반의 입출력2)/src/example07/강의교안_1장.ppt");
		System.out.println("파일의 크기 : " + (file.length()/1024/1024));
		
		//주스트림
		FileInputStream fInputStream = null;
		FileOutputStream fOutputStream = null;
		//보조스트림
		BufferedInputStream bInputStream = null;
		BufferedOutputStream bOutputStream =null;
		
		int dataCount = 0;
		long start =0;
		long end = 0;
		byte[] barr = new byte[10000];
		//주스트림에 보조스트림을 연결함
		fInputStream = new FileInputStream(file);
		bInputStream = new BufferedInputStream(fInputStream);
		
		fOutputStream = new FileOutputStream("/Users/marmin/pptx.ppt");
		bOutputStream = new BufferedOutputStream(fOutputStream);
		
		start = System.currentTimeMillis();//읽고 저장하기 전 시간을 저장
		//1바이트씩 읽고 1바이트씩 저장하는 경우(3.25)
		
		while((dataCount = bInputStream.read(barr))!= -1) {
			fOutputStream.write(barr);
		}
		
		fOutputStream.flush();
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용하지 않았을때 : " +(end - start)+"ms");
		
		System.out.println("-----------------------------------------");
		
		//바이트 기반이 아니고 버퍼를 사용한것
		start = System.currentTimeMillis();//읽고 저장하기 전 시간을 저장
		//1바이트씩 읽고 1바이트씩 저장하는 경우(3.25)
		
		while((dataCount = bInputStream.read(barr))!= -1) {
			bOutputStream.write(barr,0,dataCount);
		}
		
		bOutputStream.flush();
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용했을때 : " +(end - start)+"ms");
		
		//자원해제
		bOutputStream.close();
		bInputStream.close();
		fOutputStream.close();
		fInputStream.close();
		
		//결론 : 배열을 사용해서 적절하게 저장공간을 주고, BufferedOutputStream 등 버퍼를 보조스트림에 연결해서 사용하면 
		//속도 향상에 매우좋다
	}

}
