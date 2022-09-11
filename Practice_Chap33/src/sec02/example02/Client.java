package sec02.example02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		
		try {
			socket = new Socket();
			System.out.println("연결요청");
			socket.connect(new InetSocketAddress("localhost",7777));
			System.out.println("연결성공");
			
			byte[] bytes = null;
			String data = null;
			//////////////////
			//데이터를 서버로 보내기 위한 코드를 작성한다
			OutputStream outputStream = socket.getOutputStream();
			data = "안녕서버";
			//인코딩 , 통상 네트워크 송수신을 할때는 문자셋은 utf-8로 거의 통일화 되어있다
			bytes =data.getBytes("UTF-8");
			//일회성
			outputStream.write(bytes);
			outputStream.flush();
			System.out.println("데이터 보내기 성공");
			/////////////////////////////////////
			//데이터 받기 위해서 소켓에서 데이터 받기 위한 코드 작성
			InputStream inputStream = socket.getInputStream();
			bytes = new byte[1000];
			//read()에서 블로킹 상태가 된다
			int readcount = inputStream.read(bytes);
			data = new String(bytes,0,readcount,"UTF-8");
			System.out.println("데이터 받기 성공" + data);
			
			outputStream.close();
			inputStream.close();
			
			
		} catch (IOException e) {}
		//연결을 끊기 위한 코드 작성
		if(!socket.isClosed()) {
			try {
				socket.close();
				System.out.println("클라이언트의 socket이 닫혔습니다");
			} catch (IOException e) {}
			
		}
	}

}
