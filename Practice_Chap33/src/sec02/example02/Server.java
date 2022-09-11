package sec02.example02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			//포트와 바인딩을 하기 위한 코드
			serverSocket.bind(new InetSocketAddress("localhost",7777));
			//서버는 항상 클라이언트의 요청을 기다려야 하기 때문에 
			//무한루프를 돌리도록 한다
			while(true) {
				System.out.println("연결 대기중");
				//accept()는 클라이언트의 연결요청을 해오기 전까지는 대기 즉 블로킹 상태가 된다
				//클라이언트의 요청이 들어오면 비로소 통신용 소켓을 만들어서 리턴한다
				Socket socket = serverSocket.accept();
				//클라이언트의 ip주소를 얻는 코드
				//타입변환을 하는 이유는 socketadress 클래스를 리턴하므로 
				//자손인 아이넷 소켓 어드레스로 다운캐스팅
				InetSocketAddress inetSocketAddress =(InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("연결수락함 : " + inetSocketAddress.toString());
				
				byte[] bytes = null;
				String data = null;
				
				//데이터를 받기위해서 소켓에서 입력스트림을 얻는 코드를 작성해본다
				InputStream inputStream = socket.getInputStream();
				bytes = new byte[1000];
				//클라이언트에게 들어오는 데이터를 읽는 부분
				int readcount = inputStream.read(bytes);
				//저장했던 바이트 배열을 디코딩
				data = new String(bytes,0,readcount,"UTF-8");
				System.out.println("[데이터 받기 성공] : "+data);
				
				//데이터를 보내기 위해서 소켓에서 출력스트림을 얻는 코드
				OutputStream outputStream = socket.getOutputStream();
				data = "안녕하세요 클라이언트";
				bytes = data.getBytes("UTF-8");
				outputStream.write(bytes);
				outputStream.flush();
				System.out.println("데이터 보내기 성공");
				
				inputStream.close();
				outputStream.close();
				socket.close();
			}
			
		} catch (IOException e) {}
		//자원을 다 사용하고 나면 반드시 close호출하기
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {}
		}
	

	}

}
