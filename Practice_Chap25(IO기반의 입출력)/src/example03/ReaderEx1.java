package example03;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx1 {

	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("/Users/marmin/Documents/test.txt");
		int readData;
		while((readData = reader.read())!=-1){
			//문자출력 (바이트정보를 강제 캐스팅)
			//영문자는 아스키코드가 출력이되고 한글은 유니코드가 출력된다
			System.out.println("읽은 문자 : " + (char)readData);
		}
//		while(true) {
//			readData = reader.read();
//			if(readData ==-1) {
//				break;
//			}
//			System.out.println("읽은 문자 : " + (char)readData);
//		}
		reader.close();
	}

}
