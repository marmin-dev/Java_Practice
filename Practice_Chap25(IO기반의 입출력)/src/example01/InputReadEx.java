package example01;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputReadEx {

	public static void main(String[] args) throws Exception{
		
		//다형성이 적용된 코드, 일반예외가 발생하는데 그것을 jvm에게 던진다
		InputStream iStream = new FileInputStream("/Users/marmin/Documents/test.txt");
		int readByte; //읽은 바이트를 리턴받는 변수
		//InputStream read()는 더이상 읽을게 없다면 -1을 리턴한다
		while((readByte = iStream.read())!=-1) {
			System.out.println("읽은 바이트 수 : " + readByte);//아스키 코드값
			System.out.println("읽은 문자 : " + (char)readByte);//강제 타입캐스팅후 문자를 출력
			//인코딩을 안하면 한글은 깨져서 나온다
			//맥은 UTF-8 한글은 곧 3바이트이다
			//기본적으로 이클립스는 한글을 2바이트로 읽어들인다
		}
		//이클립스의 디폴트 코덱
		System.out.println(Charset.defaultCharset());
		//아래와 같이 작성해도 같은 결과를 얻을수있다
//		System.out.println("-------------------------");
//		while(true) {
//			readByte = iStream.read();
//			if(readByte == -1) {
//				break;
//			}
//		}
		
		iStream.close(); //리소스를 닫는다
		
		
		
	}
}
