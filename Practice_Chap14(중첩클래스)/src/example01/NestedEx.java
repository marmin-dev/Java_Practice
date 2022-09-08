package example01;

public class NestedEx {

	//인스턴스 멤버 클래스
	class A{
		int iv=100;
		//static int cv=200; static 멤버변수는 사용이 불가능하다
		//NestedEx.A.cv에 접근이 불가능하다
		public A(){
			System.out.println("A생성자 호출");
		}
		public void method1() {
			System.out.println("A클래스의 method1()호출");
		}
//		public static void method() {
//			System.out.println("A클래스의 method()호출");
//		} NestedEx.A.method접근이 불가능하다 외부클래스에 생성자가 있어서
		//인스턴스없이도 접근이 가능해야하기때문에 불가능하다
	}
	//정적멤버클래스
	static class B{
		int iv=100;
		static int cv = 500;
		
		public B(){
			System.out.println("B생성자 호출");
		}
		public void method1() {
			System.out.println("B클래스의 method1()호출");
		}
		public static void method() {
			System.out.println("B클래스의 method()호출");
		} //NestedEx.A.method접근이 불가능하다 외부클래스에 생성자가 있어서
		//인스턴스없이도 접근이 가능해야하기때문에 불가능하다
	}
	public void method() {
		//로컬클래스 선언과 사용 메서드내 선언하여 잠깐 사용할 용도
		class C{
			int iv =200;
			//static int cv = 700; 
			//스테틱멤버 선언 불가
			public C() {
			System.out.println("로콜 클래스C생성자 호출");
			}
			public void lemthod() {
				System.out.println("로컬클래스 C메서드 호출");
			}
		}
		//로컬클래스는 해당 메서드 내에서만 사용이 가능하다는 것에 주목하자
		C c = new C();
		c.lemthod();
	}
	public void method2() {
		//로컬클래스 선언과 사용 메서드내 선언하여 잠깐 사용할 용도
		class D{
			int iv =200;
			//static int cv = 700; 
			//스테틱멤버 선언 불가
			public D() {
			System.out.println("로콜 클래스D생성자 호출");
			}
			public void iemthod() {
				System.out.println("로컬클래스 D메서드 호출");
			}
		}
		//로컬클래스는 해당 메서드 내에서만 사용이 가능하다는 것에 주목하자
		D d = new D();
		d.iemthod();
	}
	public static void main(String[] args) {
		NestedEx ne = new NestedEx();
		//인스턴스 멤버클래스는 외부클래스으의 인스턴스가 있어야 생성가능하다
		NestedEx.A a = ne.new A();
		System.out.println(a.iv);
		a.method1();
		
		System.out.println("----------------------------");
		//정적 클래스는 외부클래스의 인스턴스가 없어도 접근가능하다
		System.out.println(NestedEx.B.cv);
		NestedEx.B.method();
		NestedEx.B b =new B();
		System.out.println(b.iv);
		b.method1();
		
		System.out.println("----------------------------");
		
		ne.method();
		ne.method2();
		
		//멤버클래스와 로컬클래스를 구분짓는잣대는 무엇일까?
		//순번 .... 로컬클래스는 순번이 붙는다
		//윈도우 쇼뷰 네이게이터에 들어가서 보면 순을 볼수있다
		//bin은 바이네리의 약자이다
		//중첩클래스르 볼수있는 바이트 코드 파일은 네비게이터에 있다
	}

}
