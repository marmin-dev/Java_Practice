package example08;

public class ChildEx {

	public static void main(String[] args) {
		//익명자손객체가 된다(이름없음)--UI이벤트 처리나 스레드 객체 간편생성
		Parent parent = new Parent() {
			//근본이 클래스 자손객체라하고 근본이 인터페이스이면 
			//구현객체라고 한다 익명인것은 같다
			int b = 10;
			public void method1() {
				System.out.println("익명 자손객체 메서드");
			}
			
			@Override
			public void method() {
			int a = 10;
			System.out.println("a : "+a);
			System.out.println(this.b);
			this.method1();
			}
		};
		//외부에선 익명클래스나 익명인터페이스에 접근이 불가능하다.
		parent.method();

	}

}
