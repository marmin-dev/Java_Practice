package example02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamEx02 {

	public static void main(String[] args) throws Exception{
		//파일로부터 출력스트림 생성후 대입하기
		OutputStream oStream = new FileOutputStream("/Users/marmin/Documents/write.txt");
		//ABC가나다 문자열을 통해서 바이트 배열을 얻고 있다
		byte[] data = "ABC가나다".getBytes();//기본적으로 맥에선 UTF-8
		//get바이트 매개변수에 캐릭터셋을 어떤것을 넣느냐에 따라 한글의 바이트 수가 바뀌어 바이트 배열의길이가 바뀐다
		//ISO8859-1에선 한글도 1바이트로 인식한다
		System.out.println("data바이트 배열의 크기 : " + data.length);
		
		//바이트 배열을 한번에 스트림에 보낸다. 앞서서 본 write(int b)메서드에 비해서
		//훨씬 효율적이다
		oStream.write(data);
		System.out.println("저장이 완료되었습니다");
		oStream.flush();
		//입출력을 동시에 진행하기
		InputStream iStream = new FileInputStream("/Users/marmin/Documents/test.txt");
		int count = 0;
		byte[] readByte = new byte[3];
		int i=0;
		while((count=iStream.read(readByte)) != -1) {
			i++;
			String str = new String(readByte);
			System.out.println("읽은 값 : " +str);
			System.out.println("읽은 바이트 수 : " + count);
			System.out.println("루핑수");
		}
		
		
		
		
		
		
		oStream.close();
	}

}
