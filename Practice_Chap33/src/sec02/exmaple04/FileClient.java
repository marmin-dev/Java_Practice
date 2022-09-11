package sec02.exmaple04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

public class FileClient {

	public static void main(String[] args) {
		
		Socket socket = null;
		try {
			socket = new Socket("localhost",7777);
			OutputStream outputStream = socket.getOutputStream();
			String filepath = "/Users/marmin/eclipse-workspace/Practice_Chap33/src/sec02/exmaple04/files/dialog-info.png";
			//파일 객체 얻기
			File file = new File(filepath);
			//파일 이름 얻기
			String fileName = file.getName();
			byte[] fileNameB = fileName.getBytes("UTF-8");
			fileNameB = Arrays.copyOf(fileNameB, 100);
			//파일 이름 보내는 부분
			outputStream.write(fileNameB);
			
			System.out.println("파일 보내기 시작" + fileName);
			FileInputStream fileInputStream = new FileInputStream(file);
			
			byte[] fileArr = new byte[1000];
			int readCount = -1;
			while((readCount = fileInputStream.read(fileArr))!=-1) {
				outputStream.write(fileArr , 0 ,readCount);
			}
			outputStream.flush();
			System.out.println("파일 보내기 완료");
			
			fileInputStream.close();
			outputStream.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("파일 보내기 오류 발생");
			e.printStackTrace();
		}

	}

}
