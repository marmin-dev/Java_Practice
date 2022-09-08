package example03;

public class CallStackEx {

	public static void main(String[] args) {
	//call stack 은 후입선출이다.(ex 택시기사의 동전통
	//queue 선입선출이다 fifo 선입선출 방식이다.
		
		System.out.println("main()실행됨");
		CallStackEx.first();
		//static 은 static만 호출할수있다.
		
		System.out.println("main()종료됨");
		
	}
	
	public static void first() {
		System.out.println("first()실행됨");
		second();//같은 클래스내에 메서드라면 클래스명은 무시해도 무방하다.
		System.out.println("first()종료됨");
	}
	public static void second() {
		System.out.println("second()실행됨");
		CallStackEx.third();
		System.out.println("second()종료됨");
	}
	public static void third() {
		System.out.println("third()실행됨");
		System.out.println("third()종료됨");
	}
}
