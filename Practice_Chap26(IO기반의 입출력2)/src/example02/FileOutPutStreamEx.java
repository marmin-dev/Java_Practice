package example02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutPutStreamEx {

	public static void main(String[] args) throws Exception{
		
		//파일을 복사를 하기 위해 경로를 설정
		String oriFileName ="/Users/marmin/eclipse-workspace/Practice_Chap26(IO기반의 입출력2)/src/example02/강의교안_1장.ppt";
		String targetFileName = "/Users/marmin/Documents/java1.ppt";
		
		File file = new File(oriFileName);
		FileInputStream fis = new FileInputStream(file); //파일로부터 데이터를 복사
		FileOutputStream fos = new FileOutputStream(targetFileName); //복사한 파일 출력
		
		int readByteCount;
		int i=0;
		//바이트 배열을 크게 잡을수록 복사시간이 빨라진다
		byte[] barr = new byte[10000];
		long start = System.currentTimeMillis();//현재시점저장
		while((readByteCount=fis.read(barr))!=-1) {
			//fos.write(barr);
			fos.write(barr,0,readByteCount);//읽은 바이트 수만큼 출력스트림으로 보내기
			i++;
		}
		fos.flush();
		long end = System.currentTimeMillis();
		
		fos.close();
		fis.close();
		System.out.println("총 루핑수 : " + i);
		System.out.println("복사 시간 : "+(end-start));
		System.out.println("복사한 파일의 크기"+(file.length()/1024)+"KB");
		System.out.println(file.getName()+"파일의 복사가 완료되었습니다");
	}

}
