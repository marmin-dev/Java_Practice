package example04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx03 {

	public static void main(String[] args) throws Exception{
		
		Writer writer = new FileWriter("/Users/marmin/Documents/test .txt");
		
		char[] str ="김길환이다".toCharArray();
		
		writer.write(str,1,4);
		writer.flush();
		System.out.println("파일이 생성되었습니다");
		
		writer.close();
	}

}
