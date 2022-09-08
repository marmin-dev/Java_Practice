package example04;

public class User {

//해당 클래스 자신의 ㅇ타입으로 정적멤버 선언과 동시에 생성을 하고 있다
private static User singleton = new User();
//해당 클래스 자신의 타입으로 정적 멤버 선언과 동시에 생성을 하고있다.
private User() {
}
public static void add() {
	System.out.println("add메서드 호출");
}
//해당 클래스의 멤버의 주소를 넘겨주기(공유)위해서 외부에서 호출할수 있는 
//getter 메서드를 제공해주고 있다.
public static User getInstance() {
	return singleton;
	}
}
