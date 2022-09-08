package TcpServerEx;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("Connecting...");
			socket.connect(new InetSocketAddress("localhost",7777));
			System.out.println("Server Connected");
		} catch (IOException e) {
			if(!socket.isClosed()) {
				try {
					socket.close();
				} catch (IOException e1) {}
			}
			
		}
		
	}
}
