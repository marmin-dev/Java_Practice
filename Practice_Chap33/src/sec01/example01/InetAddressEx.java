package sec01.example01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		
		try {
			//자신의 pc의 ip를 알기 위해서 아래와 같이 코드를 작성해본다
			InetAddress iAddress = InetAddress.getLocalHost();
			String ip = iAddress.getHostAddress();
			System.out.println("내 컴퓨터의 ip주소 : " + ip);
			
			//도메인 네임을 이용해서 IP주소를 알아내기 위한 코드를 작성해본다
			//보통 큰 서버를 가지고 있는 회사들의 IP는 통상 2개 이상이 된다
			InetAddress[] iAddresses = InetAddress.getAllByName("www.Naver.com");
			for(InetAddress inetAddress : iAddresses) {
				
				ip = inetAddress.getHostAddress();
				System.out.println("네이버의 ip주소 : " + ip);
			}
			iAddresses = InetAddress.getAllByName("www.Sony.com");
			for(InetAddress inetAddress : iAddresses) {
				
				ip = inetAddress.getHostAddress();
				System.out.println("Sony의 ip주소 : " + ip);
			}
			
		} catch (UnknownHostException e) {}

	}

}
