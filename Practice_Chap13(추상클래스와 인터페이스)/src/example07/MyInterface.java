package example07;

public interface MyInterface {

	int MAX_NUM =100; //static final상수
	public void method();//추상메서드 선언
	//jdk1.8부터 추가된 멤버이다
	default void dmethod() {//default가 붙어서 반드시 블럭이 있어야한다
	System.out.println("MyInterface 의 디폴트 메서드 호출");
	}
	static void smethod() {
		System.out.println("MyInterface 의 정적메서드 호출");
	}//역시 실행블럭이 필요하다
}
