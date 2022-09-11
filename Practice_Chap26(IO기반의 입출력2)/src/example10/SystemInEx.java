package example10;

import java.io.InputStream;
import java.util.Arrays;

public class SystemInEx {
	
	public static void main (String[] args) throws Exception{
		
		//콘솔로부터 입력을 받기 위해서 System.in 필드를 입력스트림에다가 대입을 한다
		InputStream iStream = System.in;
		byte[] barr = new byte[100];
		System.out.println("이름 : ");
		
		//키보드로 입력한 데이터를 barr배열에 저장하고 읽은 바이트 수를 리턴을 한다
		int nameBytes = iStream.read(barr);
		System.out.println(Arrays.toString(barr));
		
		String name = new String(barr, 0, nameBytes-1);
		System.out.print("마지막으로 남길말은? : ");
		int comBytes = iStream.read(barr);
		System.out.println(Arrays.toString(barr));
		String comment = new String(barr, 0, comBytes-1);
		
		System.out.println("입력한 이름 : " + name);
		System.out.println("남길말 : " + comment);
		
		
	}
}
