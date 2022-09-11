package example03;

import java.io.File;
import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) throws Exception {
		
		File file = new File("/Users/marmin/eclipse-workspace/Practice_Chap26(IO기반의 입출력2)/src/Files/file1.txt");
		System.out.println(file.getCanonicalPath());
		//XXXReader XXXWriter클래스는 문자특화 기반 클래스
		//동영상 또는 사진 오디오등 이진파일들을 읽을수가 없다
		FileReader fiReader = new FileReader(file);
		//System.out.println("파일크기 : " + file.length());
		
		int readcharNo;
		char[] carr = new char[1000]; //200바이트 할당
		int i=0;
		//char 배열의 사이즈가 크면 클수록 많은 데이터 한번에 읽기가 가능하다
		//속도가 향상된다
		while((readcharNo = fiReader.read(carr))!=-1) {
			String str = new String(carr,0,readcharNo);
			System.out.println(str);
			i++;
		}
		System.out.write(13);//개행
		System.out.println("루핑 수 : " + i);	
		fiReader.close();
	}

}
