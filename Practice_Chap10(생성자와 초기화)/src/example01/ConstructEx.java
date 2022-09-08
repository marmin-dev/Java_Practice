package example01;

public class ConstructEx {
//A클래스는 아무런 생성자가 존재하지 않으므로 
//컴파일시 기본 생성자를 컴파일러가 알아서 생성해준다.
	class A{
		int value;
	}
	class B{
		int value;
		//public B() {
		//}
		public B(int value) {
			this.value=value;
		}
	}
	
	public static void main(String[] args) {
	
		//A a = new A();
		//컴파일예외를 잡는 방법 
		//1.B클래스에 기본 생성자를 추가
		//2.B클래스 생성자 호출시 매개변수값으로 int 형
		//B b = new B();

	}

}
