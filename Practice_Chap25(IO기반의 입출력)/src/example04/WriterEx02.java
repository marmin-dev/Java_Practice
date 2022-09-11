package example04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx02 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("/Users/marmin/Documents/test.txt");
		char[] str = "김길환".toCharArray();
		//write()의 매개변수 타입이 문자배열이다.
		//이전에 학습했던 write (intb)보다 훨씬 효율적이다
		writer.write(str);
		writer.flush();
		System.out.println("파일생성완료");
		writer.close();

	}

}
