package example03;

public class MemberPersonEx {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.method();
		member.method1();

		//인터페이스도 일종의 조상이다.하여 다형성 개념이 적용된다.
		A a = new Member();  //인터페이스필드의 다형성 
		a.method();	//근본을 벗어나지 못하므로 멤버 클래스의 멤버메서드는 호출불가
		
		Person person = new Person();
		person.method();
		person.method1();
		
		a = new Person();
		a.method();
		//인터페이스의 다형성을 표현해낸것이다.
		System.out.println(A.MAX);//상수는 클래스나 인터페이스명.상수명을 입력 
	}

}
