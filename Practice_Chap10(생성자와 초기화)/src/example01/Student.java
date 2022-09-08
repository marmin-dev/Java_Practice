package example01;

public class Student {
//인스턴스 멤버 변수를 선언함.
	private String name;
	private int age;
	//클래스명과 생성자 명이 같이 같아야한다.
	//생성자는 리턴타입이 존재하지 않는다.(void라는것을 써주지않는다)
	//생성자가 하나도 없는 클래스는 기본적으로 컴파일시에 컴파일러가 알아서
	//기본생성자를 추가해준다.
	public Student() {
		System.out.println("기본생성자 호출");
		return;
	}
	public Student(String name) {
		System.out.println("매개변수 string만 있는 생성자 호출");
		this.name=name;
	}
	public Student(int age) {
		System.out.println("매개변수 int 만 있는 생성자호출");
		//왠만하면 리턴값은 적어주지 않는것이 좋다 왜냐면 없는것이 원칙이기 떄문이다.
	}
	//제네레이트 유징필드를 이용하여 매개변수가 있는 생성자.
	public Student(String name, int age) {
		System.out.println("매개변수가 있는 생성자 호출");
		this.name=name;
		this.age =age;
	}
	



	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.getName() + "," + this.getAge();
		}
}
