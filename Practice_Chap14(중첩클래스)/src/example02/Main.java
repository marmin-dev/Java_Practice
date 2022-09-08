package example02;

public class Main {

	public static void main(String[] args) {
		
		A a = new A();//생성자에서 일어나는 일
		//인스턴스 멤버클래스인 B는 반드시 외부클래스인 A의 인스턴스가 있어야
		//사용이가능하다
		A.B b =a.new B();//따로 호출하면 일어나는 일
		b.method1();
		System.out.println("------------------");
		A.C.method2();
		System.out.println(A.C.c);
		A.C c =new A.C();
		//정적멤버 클래스인 C는 외부클래스 A의 인스턴스가 있던없던 상관
		//없이 접근이 가능하다
		System.out.println(c.a);
		c.method1();
		System.out.println("------------------");
		//외부클래스인 인스턴스를 생성하면 얼마든 메서들르 호출하여
		//로컬클래스를 생성할수있다
		a.method();
	}

}
