package example01;

public class ValEx01 {

	public static void main(String[] args) {
		char ch = 'A';
		//문자열 타입은 스트링으로 받아줘야 문제가 생기지 않는
		int year = 0;
		int age = 42;
	long result = 10l;
	float result2 = 10.1f;
			double d = 9.99;
	//아래코드에서는 플로트를 지정해주기 위해서 접미사 f를 붙여줬다.
	//디폴트 타입이 아닌 경우 원래는 뒤에접미사를 붙여줘야한다.
		//쉬프트 큐를 누르면 인텔리전스 기능이 실행된다
		//자동완성
			System.out.println("ch:"+ch);
			System.out.println(result);
			System.out.println(result2);
System.out.println(year + age);
String str = new String("자바");
System.out.println(str + "를 공부해 볼까요?");

//사용자 정의 클래스이거나 tostring()재정의를하지않은
//클래스의 참조변수는 출력을 하게 되면, 클래스타입 16진수 주소가 나온다.
Object obj1 = new Object();
System.out.println(obj1);


	}

}
