package example04;

public class Car {

	int speed;
	
	public Car() {
	}

	public Car(int speed) {
		this.speed = speed;
	}
	//메서드 앞에 제어자 final 이 붙으면 자손에서 오버라이딩을 할수가 없다. 
	//메서드 앞에 final이 오면 상속안되여 마지막으로 생각하십쇼.
	
	public final void speedUp() {
		this.speed +=10;
		System.out.println("차가 " + this.speed + "속도로 달립니다");
	}

	public final void speedDown() {
		this.speed -=10;
		System.out.println("차가 " + this.speed + "속도로 달립니다");
	}
	public void stop() {
		System.out.println("차가 멈춥니다!");
	}
	
}
