package example05;
//조상클래스
public class Parent {

	int x = 100;
//매개 변수가 있는 생성자
	public Parent(int x) {
		System.out.println("조상클래스생성자 호출");
		this.x=x;
	}
	
	public Parent() {
		System.out.println("조상클래스생성자 호출");
	}
	public void show() {
		System.out.println("조상클래스의 show 호출 : ");
	}
	
}
