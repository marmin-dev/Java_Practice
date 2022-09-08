package example03;

public class Person implements A {

	@Override
	public void method() {
		System.out.println("인터페이스 A를 구현한 Person클래스 입니다");
	}
	public void method1() {
		System.out.println("Person class 의 메소드 입니다");
	}
	//멤버와 펄슨 사이에는 직접적인 관계는 없지만, 같은 인터페이스를 구현하는 
	//간접적인 관계라 할수있다. 이를 통하여 두 클래스는 A계열이라 칭한다.
	
	
}
