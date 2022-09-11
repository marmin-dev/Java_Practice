package example05;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BufferedInputStringEx {

	public static void main(String[] args) throws Exception {
		
		long start = 0;
		long end = 0;
		File file = new File("/Users/marmin/eclipse-workspace/Practice_Chap26(IO기반의 입출력2)/src/example05/강의교안_11장.ppt");
		//바이트 기반을 속도의 차이를 보기위한 프로그램 작성
		FileInputStream fstream1 = new FileInputStream(file);
		System.out.println("File의 크기 : " + file.length() ); //약 2.9메가
		
		System.out.println("바이트 기반 읽기 시작");
		start = System.currentTimeMillis();
		//그냥 읽기만 한다
		while(fstream1.read() != -1) {	}
		
		System.out.println("바이트 기반 읽기 끝");
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용하지 않았을 때  : "+  (end -start));
		//사용을 하지 않을떼 약 1.2초
		fstream1.close();
		
		//주 입력스트림안 FileInputStream 에다가 속도 및 성능향상 보조스트림인 BufferdInputStream을 연결한다
		//실질적으로 파일을 읽어오는 스트림은 바로 주스트림이고, 읽어온 데이터를 빨리 처리해주는 역할이 바로 보조스트림인
		//BufferedInputStream이다
		start = System.currentTimeMillis();
		FileInputStream fStream2 = new FileInputStream(file);
		BufferedInputStream bstream = new BufferedInputStream(fStream2);
		while(bstream.read()!=-1) {}
		System.out.println("버퍼 기반 읽기 끝");
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용했을 때 (버퍼기반)"+(end - start));
		//버퍼사용시 약 30미리세컨드 약 0.032초 소
		
		bstream.close();
		fStream2.close();
	}
	

}
