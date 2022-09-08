package exam01;

class A{}
class B extends A{}
class C extends A{}

interface I{}
class D implements I{}
class E implements I{} 
public class ClassCastEx {

	public static void main(String[] args) {
		//조상클래스의 참조변수가 참조하고 있는 인스턴스 타입이 B이다
		
		A a =new B();
		B b =(B)a;
		
		A a1 = new B();
		
		C c = (C)a1;
	}

}
