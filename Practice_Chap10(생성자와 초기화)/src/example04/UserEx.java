package example04;

import java.sql.Date;
import java.util.Calendar;

public class UserEx {

	public static void main(String[] args) {
		//User user1=new User();
		User user1=User.getInstance();
		User user2=User.getInstance();
		//싱글톤 패턴을 사용하는 실제적인 ㅇ{
		Calendar cal = Calendar.getInstance();
		java.util.Date d= cal.getTime();
		System.out.println(d);
		
		
		System.out.println("user1 의 주소 : " + user1);
		System.out.println("user2 의 주소 : " + user2);
		//Object 클래스의 이퀄즈는 주소비교
		//if(user1==user2) 
		if(user1.equals(user2)){
			System.out.println("같은 객체입니다.");
		}
		else {
			System.out.println("다른 객체입니다");
		}
		//싱글톤 패턴을 사용하는 이유
		//단하나의 인스턴을 생성해서 서로 공유를 원하고자 할때 사용
		//ex)사용자 환경설정 , 커넥션풀 , 스레드풀, os의 시간등 달력
	}

}
