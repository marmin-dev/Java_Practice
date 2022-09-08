package example07;

public class Person implements MyInterface {

	@Override
	public void method() {
		System.out.println(MyInterface.MAX_NUM);
		System.out.println("MyInterface 를 구현한 Person클래스 메소드 호출");
	}
	//구현클래스들에게 전혀 영향을 끼치지 않고, 디폴트 메서드가 필요한 구현클래스에서만 
	//오버라이딩을 해서 사용하면 된다.
	@Override
	public void dmethod() {
		System.out.println("MyInterface 를 오버라이딩한 메서드 호출");
	}
}
