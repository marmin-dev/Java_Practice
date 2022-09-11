package example01;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void main(String[] args) throws Exception {
		//'\'원화표시 또는 슬러시 곧 이스케이프 두개를해줘야 하나를 표현
		//아니면 '/'하나로 표식을 해도 무방하다
		File file = new File("/Users/marmin/eclipse-workspace/Practice_Chap26(IO기반의 입출력2)/src/example01/FileInputStreamEx.java");
		System.out.println("파일의 경로 : "+file); //파일의 경로를 얻기
		System.out.println("부모 디렉토리 : "+file.getParent());
		System.out.println("실행가능한가 : "+file.canExecute());
		System.out.println("읽기가능한가 : "+file.canRead());
		System.out.println("읽기나 수정이 가능한가 : "+file.canWrite());
		System.out.println("파일이름 : " + file.getName());
		System.out.println("숨김 파일 인가 : "+file.isHidden());
		System.out.println("파일의 크기 : "+file.length());
		System.out.println("URI 출력 형태 : "+file.toURI());
		System.out.println("URI 출력 형태 : "+file.toURL());
		//생성자에 매개변수로 File 객체를 받고있다
		FileInputStream files = new FileInputStream(file);
		int data;
		int i=0; //한바이트씩 읽기
		byte[] barr = new byte[1000];
		while((data=files.read(barr))!=-1) {
			//System.out.print((char)data+" ");
			
			//System.out.print((char)data);
			System.out.write(barr);
			//1바이트씩 읽기 떄문에 한글이 꺠지기 떄문에 write를 써도 괜찮다
			//write 메서드 역시 출력스트림이기 때문에 가능하다
			i++;
			
		}
		
		System.out.println("루핑수 : " +i);
		files.close();
		
		
		
		

	}

}
