package example01;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx {

	public static void main(String[] args) throws Exception{
		//아랫줄을 실행한다해서 디렉토리폴더를 만들지는 않는다 참조만 얻는 준비를한다
		File directory = new File("/Users/marmin/Documents/directory");
		File file1 = new File("/Users/marmin/Documents/file1.txt");
		File file2 = new File("/Users/marmin/Documents/file2.txt");
		File file3 = new File(new URI("file:///Users/marmin/Documents/file3.txt"));
		
		
		
		//URI객체: 문자열 전송과 조작을 위한 프로토콜
		//URL객체: 네트워크 전송을 위한 프로토콜
		//프로토콜:통신규약(TCP/IP/UDP...)
		//URI는 통합자원식별자 인터넷에있는 자원을 나타내는 유일한 주소를 의미한다
		
		//URI사용 예시'
//		String uriName ="http://www.google.co.kr";
//		URI uri = new URI(uriName);
//		System.out.println(uri);
		//디렉토리 폴더가 존재하느냐?
		
		if(directory.exists()==false) {
			//부모디렉토리가 없으면 자기자신의 폴더를 만들고,부모가 있다면 그안에 자신의
			//폴더를 만든다 단, 부모 폴더가 없는데 경로를 부모를 줬다면 폴더는 
			//만들어지지않는다
			//directory.mkdir();
			//얘는 부모폴더부터 다만들어준다!
			//경로상 없는 디렉토리를 다 생성해준다 , 곧 권장방법이다
			directory.mkdirs();
		}
		if(file1.exists()==false) {
			//만약 도큐먼트 폴더가 존재하지 않는다면 IOException을 발생시킨다
			file1.createNewFile();
			System.out.println("file1.txt가 생성되었습니다");
		}
		
		if(file2.exists()==false) {
			//만약 도큐먼트 폴더가 존재하지 않는다면 IOException을 발생시킨다
			file2.createNewFile();
			System.out.println("file2.txt가 생성되었습니다");
		}
		
		if(file3.exists()==false) {
			//만약 도큐먼트 폴더가 존재하지 않는다면 IOException을 발생시킨다
			file3.createNewFile();
			System.out.println("file3.txt가 생성되었습니다");
		}
		File tmp = new File("/Users/marmin/Documents");
		//tmp 서브 디렉토리 및 파일을 파일 배열로 만들어서 출력해보기
		File[] contents = tmp.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM--dd a HH:mm");
		System.out.println("날짜\t시간\t형태\t크기\t이름");
		System.out.println(sdf.format(new Date()));
		System.out.println("-----------------------------------");
		for(File file:contents) {
			System.out.println(sdf.format(new Date(file.lastModified())));
			//파일이 디렉토리냐?
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t"+file.getName());
			}
			//파일이면 파일의 이름과 크기를 출력한다
			else {
				System.out.println("\t\t\t" + file.length()+"\t"+file.getName());
			}
		}
	
	}

}
