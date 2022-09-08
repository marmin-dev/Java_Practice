package TcpServerEx;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost",7777));
			while(true) {
				System.out.println("Waiting Connect");
				Socket socket = serverSocket.accept();
				//소켓주소 얻어오기
				InetSocketAddress inetSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				//얻어온 소켓주소 콘솔창으로 출력하기
				System.out.println(inetSocketAddress.toString());
			}
		} catch (IOException e) {
			if(!serverSocket.isClosed()) {
				try {
					serverSocket.close();
				} catch (IOException e1) {
				}
			}
			
		}
		
		
		
		
	}
	
	
	
	
}
