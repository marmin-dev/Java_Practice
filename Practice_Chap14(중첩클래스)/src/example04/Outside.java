package example04;

public class Outside {

	//필드 선언
	String str = "Outside-field";
	
	//멤버 메서드
	public void method() {
		System.out.println("Outside-method()호출");
	}
	class Inner{
		//필드 선언
		String str = "Inner-field";
		//멤버 메서드
		public void method() {
			System.out.println("Inner-method()호출");
		}
		//멤버 메서드
		public void showInfo() {
			//여기에서의 this는 이너클래스의 this이다
			System.out.println(this.str);
			this.method();
			//외부클래스에 접근하는 방법
			System.out.println(Outside.this.str);
			Outside.this.method();
		}
	}
	public void show() {
		System.out.println("--------------------------");
		//외부클래스 영역에서의 this 당연히 Outside클래스를 말한다
		System.out.println(this.str);
		this.method();
		
		//외부클래스에서 내부클래스로 접근을 하려면 보이지 않는다
		//아래와 같이 인스턴스를 하나 생성해서 중첩클래스의 멤버드에게 접근을
		//하면된다
		Inner in = new Inner();
		//System.out.println(in.str);
		in.showInfo();
	}
	
}
