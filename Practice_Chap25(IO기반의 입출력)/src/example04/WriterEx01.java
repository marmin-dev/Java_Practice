package example04;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;

public class WriterEx01 {

	public static void main(String[] args) throws Exception{
		
		Writer writer = new FileWriter("/Users/marmin/Documents/test.txt");
		
		
		//toCharArray()는 문자열을 char로 리턴
		char[] str = "홍길동".toCharArray();
		System.out.println(Arrays.toString(str));
		for(int i=0; i< str.length;i++) {
			writer.write(str[i]);
			System.out.println("루핑수 : "+ i);
		}
		//강제로 버퍼를 비워준다
		writer.flush();
		System.out.println("파일이 생성되었습니다");
		writer.close();
	}

}
