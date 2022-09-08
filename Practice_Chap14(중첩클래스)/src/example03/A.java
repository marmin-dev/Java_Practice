package example03;

public class A {

	//인스턴스 멤버클래스
	class B{
		public B() {
		System.out.println("인스턴스 멤버 클래스 B의 생성자");
		}
	}
	//정적 멤버 클래스
	static class C{
		public C() {
			System.out.println("정적 멤버 클래스 C의 생성자");
		}
	}
//	//인스턴스 멤버 (필드) 문제없음
	B b = new B();
	C c = new C();
	
	//인스턴스 멤버 메서드가 된다
	//method1()을 사용할때 쯤은, 이미 외부클래스 A의
	//인스턴스가 만들어진 상태일것이다
	public void method1(){
		System.out.println("method1()내");
		B b = new B();
		C c = new C();
	}
	//정적멤버선언
	//static B b1 = new B();
	//사용자의 입장에서 봤을때 B는 인스턴스 멤버클래스 이기때문에 스테틱을 붙히면 
	//신택스 에러가 난다
	//static은 static만 접근이 가능하다
	static C c1 = new C();//가장먼저 실행된다
	//static A.B c2 = new B(); 역시 같은 이유로 불가능하다
	public static void method2() {
		System.out.println("method2()내");
		//B b = new B();//인스턴스 멤버클래스 이므로 불가능하다
		C c = new C();//정적 메서드이므로 정적 로컬 로컬변수로 선언해도 무방하다
	}
	//결론 중첩클래스에서으 인스턴스 필드나 메서드는 언제든지 생성 가능하지만, 정적필드나 
	//정적 메서드는 정적클래스에서만 생성이 가능하다.
}
