package example03;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx02 {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("/Users/marmin/Documents/test.txt");
		int readData;
		char[] carr = new char[2];
		//String str ="";
		StringBuilder sbuilder =new StringBuilder();
		//read() 매개변수가 char[]타입이라는 것에 주목을 반드시하자
		
		
		while((readData=reader.read(carr)) != -1) {
			//str += new String(carr, 0 ,readData);//읽은 문자를 문자열로 생성
			sbuilder.append(carr);
			System.out.println("읽은 문자수 : " +readData);
		}
		//문자열 출력
		System.out.println(sbuilder);
		reader.close();

	}

}
