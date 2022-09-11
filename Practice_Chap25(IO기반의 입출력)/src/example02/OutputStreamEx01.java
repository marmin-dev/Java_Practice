package example02;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class OutputStreamEx01 {

	public static void main(String[] args) throws Exception {
		//파일로부터 출력스트림을 생성하여 대입한다(다형성)
		OutputStream ostream = new FileOutputStream("/Users/marmin/Documents/test.txt");
		//ABC라는 문자열에서 바이트 배열을 얻어내는 것이다(인코딩)
		byte[] data = "ABC".getBytes();
		System.out.println(Arrays.toString(data)); //아스키코드가 출력됨
		//3번루핑한다 한글자씩 보내니까 루핑이 3번돈다
		for(int i =0; i<data.length;i++) {
			ostream.write(data[i]);
		}
		//write()메서드를 사용하면 무조건 flush메서드를 호출하여 반드시 메모리 버퍼를
		//비우도록 하자,물론 main() 가 종료하면 알아서 버퍼에서 나가지만,
		//왠만하면 flush를 호출하도록 하는것을 습관화하도록 합니다
		ostream.flush();
		System.out.println("저장이 완료되었습니다");
		
		
		ostream.close();

	}

}
