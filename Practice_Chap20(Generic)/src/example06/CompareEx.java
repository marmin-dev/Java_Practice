package example06;

public class CompareEx {

	public static void main(String[] args) {
		
		int result = Compare.compare(200, 200);
		System.out.println(result);
		
		//String클래스는 넘버클래스 하고는 아무런 관계가 없다
		//Compare.compare("홍길동", "김길동");
		//넘버 클래스는 오브젝트 클래스의 자손이기떄문에 매개변수타입을 적합하지 않다
		//Compare.compare(new Object(),new Object());
		result = Compare.compare(new Integer(100), new Double(75.11));
		System.out.println(result);
		//넘버는 추상클래스 이기떄문에 들어올수가 없다
		//result = Compare.compare(new Number(), nw Number());
		
	}

}
