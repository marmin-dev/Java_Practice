package example04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx04 {

	public static void main(String[] args) throws Exception{
		
		Writer writer = new FileWriter("/Users/marmin/Documents/test.txt");
		String str ="나 전두환이다. 네놈을 단죄하러왔다";
		
		//매개변수가 String 타입이다.하여 string 타입을 파일에 그대로 저장하게된다
		writer.write(str,2,10);//문자열 두번째 인덱스 부터 10개의 문자를 파일로 저장하기
		System.out.println("파일 생성 완료");
		writer.close();

	}

}
