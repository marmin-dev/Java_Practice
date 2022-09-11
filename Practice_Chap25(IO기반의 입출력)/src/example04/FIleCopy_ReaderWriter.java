package example04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FIleCopy_ReaderWriter  {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("/Users/marmin/Documents/test.txt");
		Writer writer = new FileWriter("/Users/marmin/Documents/test_복사본.txt");
		
		String str ="";
		int readBytes;
		char[] carr = new char[1000];
		int i=0;
		while((readBytes=reader.read(carr))!=-1) {
			String str1 = new String(carr);
			str += str1;
			i++;
			System.out.println("루핑수 : "+i);
			System.out.println("읽은 바이트수 : " + readBytes);
		}
		writer.write(str);
		writer.flush();
		System.out.println("복사본 생성완료");
		writer.close();
		reader.close();

	}

}
