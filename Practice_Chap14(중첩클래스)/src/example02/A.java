package example02;

public class A {
	

	
	
	//B b1 = new B();역시 멤버이기 떄문에 가능하다.
	public A() {
	System.out.println("=========================");
	System.out.println("외부클래스 A의 생성자 호출");
	B b = new B();
	//이게가능한 이유는 인스턴스멤버클래스는외부클래스 A의 멤버이다
	System.out.println(b.a);
	b.method1();
	C c =new C(); //멤버로써 생성자가 존재하기 때문에 문제가 없다
	System.out.println(c.a);
	System.out.println(c.c);
	c.method1();
	C.method2();
	this.method();
	
	//D d = new D(); 로컬클래스 곧 메서드내에 있어 불가능하다
	//클래스 A 의 입장에선 메서드 내에있어 호출이 불가능하다
	System.out.println("=========================");
	}
	//인스턴스 멤버클래스 B
	class B{
		int a =10;
		//static int cv =20;
		public B() {
		System.out.println("중첩 클래스 B의 생성자 호출");
		}
		public void method1() {
		 System.out.println("B클래스의 멤버클래스 호출");
		}
	}
	//정적 멤버클래스 c
	static class C{
		int a= 10;
		static int c =20;
		public C() {
		 System.out.println("정적멤버클래스 C생성자 호출");
		}
		public void method1() {
			System.out.println("정적멤버클래스C의 메서드1호출");
		}
		public static void method2() {
			System.out.println("정적멤버클래스C의 메서드2호출");
		}
	}
	public void method() {
		//로컬 클래스내에는 절대 static멤버가 못온다
		class D{
			int a =1000;
			public D() {
				System.out.println("로컬 클래스 D의 생성자 호출");
			}
			public void lmethod() {
				System.out.println(this.a);
				System.out.println("로컬클래스 D의 멤버 메서드 호출");
			}
		}
		D d = new D();
		d.lmethod();
		
	}
}
