package example08;

public class SoundEx {

	public static void main(String[] args) {
		//익명구현객체를 만드는법(이름이 없다)
		Soundable soundable = new Soundable() {
			//타입(근본)이 인터페이스이기 떄문에 익명구현객체가된다
			//내부적으로 클래스이기 때문에 멤버들을 선언할수있다
			//하지만 외부에서 접근이 불가능하다(근본이무엇인가?)
			int a=10;
			public void method() {
				System.out.println("익명구현객체 메서드");
			}
//UI이벤트 처리나 스레드 객체 간편생성에서 사용한다
			@Override
			public void sound() {
				String str = "냄비";
				System.out.println("첫 번째 익명구현객체: "+str);
				System.out.println(str+"에 물을 담습니다");
				System.out.println(str+"를 숫가락으로 칩니다");
				this.method();
				System.out.println(a);
			}
		};
		soundable.sound();
		
		//익명구현객체를 만드는법(이름이 없다)
		Soundable soundable1 = new Soundable() {
			//타입(근본)이 인터페이스이기 떄문에 익명구현객체가된다
			//내부적으로 클래스이기 때문에 멤버들을 선언할수있다
			//하지만 외부에서 접근이 불가능하다(근본이무엇인가?)
			int a=10;
			public void method() {
				System.out.println("익명구현객체 메서드");
			}
//UI이벤트 처리나 스레드 객체 간편생성에서 사용한다
//잠시 오버라이딩해서 사용할목적으로 하는것이 익명구현객체이다.
			@Override
			public void sound() {
				String str = "밥그릇";
				System.out.println("첫 번째 익명구현객체: "+str);
				System.out.println(str+"에 물을 담습니다");
				System.out.println(str+"를 숫가락으로 칩니다");
				this.method();
				System.out.println(a);
			}
		};
		soundable1.sound();
	}

}
