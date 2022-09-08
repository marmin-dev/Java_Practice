package example02;

public class Car {

	String color; // 색상
	String gearType;
	int door;	
	//기본 생성자
	//코드가 복잡하다.
	public Car() {
		//직접적으로 인스턴스 멤버변수를 초기화
//		this.color = "노랑";
//		this.gearType = "수동";
//		this.door = 4;
		//같은 클래스내에 있는 매개변수가 3개 있는 생성자를 호출하는 구문
		this("검정","수동",4);
	}
	
	public Car(String color) {
		this.color=color;
	}
	public Car(String color,String gearType) {
		this.color=color;
		this.gearType=gearType;
	}
	public Car(String color,int door) {
		this.color=color;
		this.door=door;
	}
	
	
	//this 는 참조변수와 같은 역할을 한다.매개변수와 멤버변수를 구분짓는데 사용한다.
	public Car(String color,String gearType, int door) {
		this.color = color; //this. 을빼면 변수위 모호성이 일어나서 초기화가
		//이루어지지 않는다.
		this.gearType =gearType;
		this.door = door;
		
	}//인스턴스 복제를 위한 생성자.
	public Car(Car c) {
		this.color = c.color; //this. 을빼면 변수위 모호성이 일어나서 초기화가
		//이루어지지 않는다.
		this.gearType =c.gearType;
		this.door = c.door;
	}
	@Override
	public String toString() {
		return this.color + "," + this.gearType +","+this.door;
	}
}
