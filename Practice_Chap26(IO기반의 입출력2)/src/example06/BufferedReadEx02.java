package example06;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReadEx02 {

	public static void main(String[] args) throws Exception{
		
		//주스트림 바이트 기반
		InputStream iStream = System.in;
		//보조스트림 하나는 바이트를 문자로 바꿔주는
		Reader reader = new InputStreamReader(iStream);
		//보조스트림 두번째는 속도 및 성능 향상을 해주는 BufferedReader 연결함
		BufferedReader breader = new BufferedReader(reader);
		
		System.out.println("입력 : ");
		//한줄단위로 읽는것 보통, 버퍼드리더 보조스트림은 리드라인을 사용하기 위해 많이 사용된다
		String lineString = breader.readLine();
		System.out.println("출력 : "+lineString);
		
		breader.close();
		reader.close();
		iStream.close();
	}
}


