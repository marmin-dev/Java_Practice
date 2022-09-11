package example10;

import java.util.Arrays;

public class OutputStream {

	public static void main(String[] args) throws Exception {
		
		//printstream (system.out)은 output의 자손클래스이므로
		//얼마든 대입이 가능하다(다형성)
		java.io.OutputStream oStream = System.out;
		//아스키 코드표 출력
		for(byte b = 48;b<58;b++) {
			System.out.print("아스키 코드 write() 후 출력된 문자값");
			System.out.print(b + "\t");
			oStream.write(b);
			System.out.println();
		}
		oStream.write(13); //출력스트림을 이용한 줄바꿈
		for(byte b = 97;b<127;b++) {
			System.out.print("아스키 코드 write() 후 출력된 문자값");
			System.out.print(b + "\t");
			oStream.write(b);
			System.out.println();
		}
		oStream.write(13);
		
		String str = "저는 자바를 열심히 하는 사람입니다";
		byte[] barr = str.getBytes();
		System.out.println(Arrays.toString(barr)); //주소값 출력
		oStream.write(barr); //한번에 문자열을 출력함
		oStream.flush();
		oStream.close();
	}

}
