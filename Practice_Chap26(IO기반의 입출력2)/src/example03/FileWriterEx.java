package example03;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx {

	public static void main(String[] args) throws Exception {
		
		File file = new File("/Users/marmin/abc.txt") ;
//		FileWriter fwriter = new FileWriter(file); //내용이 계속 덮어써진다
		//생성자에 true라는 매개변수가 붙어있기 때문에, 기존 파일에 append가 된다.
		FileWriter fwriter = new FileWriter(file,true); //내용이 계속 이어진다
		
		fwriter.write("아이러브유 유러브미 위 아 프렌드" + "\r\n");
		fwriter.write("다시 보낸내용입니다"+ "\r\n");
		
		
		System.out.println(file.getName() + " 이 생성되었습니다");
		fwriter.flush();
		fwriter.close();

	}

}
