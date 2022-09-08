package example03;

public class ThrowsEx {
//JVm에게 예외를 던진다
	public static void main(String[] args) {
		
		//main에서 method1()을 호출하고 있으니 여기서 예외처리를 
		//해야한다.
			try {
				method1();
			} catch (Exception e) {
			System.out.println("fuckkkkkkyaaaaa");
			}
		
		
		

	}
	//throws는 메서드 선언부 끝에 작성을 하며, 호출한 곳으로 예외를 되던지며 반드시 예외처리
	//호출한 곳에서 반드시 예외를 처리해야한다.
	public static void method1() throws Exception {
		method2();
	}
	public static void method2()throws Exception{
		System.out.println(10/0);
	}

}
