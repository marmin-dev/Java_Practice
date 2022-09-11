package example03;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx03 {

	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("/Users/marmin/Documents/test.txt");
		char[] carr = new char[4];
		//carr배열에 1번쨰 인덱부터 test.txt 파일에 있는 3자를 읽어서 저장해주세요
		int readData = reader.read(carr,0,4);
		System.out.println("읽은 문자 수  : " + readData );
		//출력결과는 0인덱스애서 공백이 출력돠며,1,2,3 인덱스에 있는것만
		//읽어서 출력한다
		for(int i=0;i<carr.length;i++) {
			System.out.println(i+"번째 문자 : "+carr[i]);
		}
		
		
		
		
		
		reader.close();
	}

}
