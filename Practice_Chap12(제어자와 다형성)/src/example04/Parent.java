package example04;

public class Parent {
	
	int x=100;
	//매개변수의 타입이 오브젝트라는것은 어떠한 클래스도다 받아주겠다는것.
	public void type(Object obj) {
		if(obj instanceof Parent) {
			Parent parent = (Parent)obj;//강제 타입 캐스팅
			System.out.println("조상클래스의 멤버 x값 : "+this.x);
		}
	}
	public void method() {
		System.out.println("조상메서드 호출");
	}

}
