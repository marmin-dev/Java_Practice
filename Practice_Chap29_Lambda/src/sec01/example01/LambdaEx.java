package sec01.example01;

public class LambdaEx {

	public static void main(String[] args) {
		
		//람다식을 이용해서 익명구현객체를 생성하고있는 것이다
		//매개변수가 없을때()는 생략불가인것을 알고있다
		//{}는 추상메서드인 method()의 구현부가 들어가야하며
		//여기서 2줄이기때문에 {}를 생략이 불가능하다
		MyInterface myInterface = ()->{
			String str= "람다식으로 만든 익명구현객체입니다";
			System.out.println(str);
		};
		myInterface.method();
		
		MyInterface myInterface2 = new MyInterface() {
			
			@Override
			public void method() {
				String str= "람다식으로 만든 익명구현객체입니다";
				System.out.println(str);
			}
		};
		myInterface2.method();
		//실행문이 하나일 경우에는 {}를 생략이 가능하다
		MyInterface myInterface3 =()->System.out.println("살려주세요");
		myInterface3.method();
		
		//결론 : 익명구현 객체를 생성시에 코드의 절감으로 람다식을 사용할수가 있다
		//
	}
}
