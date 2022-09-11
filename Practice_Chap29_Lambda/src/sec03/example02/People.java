package sec03.example02;

public class People {
	
	private String name;
	private int age;
	
	public People() {
		System.out.println("기본 생성자 호출");
	}
	public People(String name) {
		System.out.println("매개변수 이름 ");
		this.name = name;
	}
	public People(String name, int age) {
		System.out.println("생성자 호출");
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "이름: " + name +", 나이: "+age;
	}
	
}
