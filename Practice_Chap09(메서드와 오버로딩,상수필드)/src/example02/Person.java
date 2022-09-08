package example02;

public class Person {
//final 초기화 방법
//1.선언과 동시에 초기화
//2.생성지에서 단한번 초기화
	//무조건 선언과 동시에 초기화가 반드시 이루어져야한다
	//클래스 별로 관리되어진다.
	//스태틱 파이널은 독립되어 하나만 존재가능하다. 독립주소
	//전역변수와 같은 개념이다 . 
	//한개만 생성이되고 주소가 공유되는 타입이다.
	//참조를 할수있게된다.
	final String nation = "KOREA";
	final int age;
	static final int MAX_NUMBER = 100;//얘는 생성자에서도 초기화가 안됨.
	public Person(int age) {//기본생성자
		this.age=age;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "nation : "+ this.nation + this.age;
		}
	
}
