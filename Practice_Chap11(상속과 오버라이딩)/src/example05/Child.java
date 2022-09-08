package example05;

public class Child extends Parent{
	int x=20;
	@Override
	public void show() {
		System.out.println("현재인스턴스의 x = "+ x);
		System.out.println("자손클래스의 x = "+this.x);
		System.out.println("조상클래스의 x = "+super.x);
		super.show();//조상클래스의 show 호출
	}
	public Child() {
		//super();//조상클래스의 기본 생성자 호출, 생략하더라도 컴파일러가 알아서 추가됨
		super(80);//조상클래스의 매개변수가 있는 생성자를 호출,생략하면 절대로 안된다.
	System.out.println("자손 클래스의 생성자 호출");
}
	
	
}
