package sec03.example01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {

	private String str; //보낼데이터
	private static int SERVERPORT = 7777;
	private Scanner scanner = new Scanner(System.in);
	
	//생성자
	public UDPClient(String ip,int port) {
		try {
			InetAddress inetAddress = InetAddress.getByName(ip);
			DatagramSocket datagramSocket = new DatagramSocket();
			System.out.print("서버에 보낼 내용");
			str = scanner.nextLine();
			//인코딩
			byte[] bytes = str.getBytes("UTF-8");
			//보낼 내용을 Datagram Packet 으로 만든다
			DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length,inetAddress,SERVERPORT);
			//datagram socket을 이용하여 데이터 보낸다
			datagramSocket.send(datagramPacket);
			
			datagramSocket.close();
			
		} catch (Exception e) {
			System.out.println("데이터 보내기 실패");
		}
	}
	
	public static void main(String[] args) {
		new UDPClient("localhost", 9999);

	}

}
