package example04;

public class SportCar extends Car {
	
	int speed;
	
	public SportCar() {
	}
	public SportCar(int speed) {
		this.speed=speed;
	}
	@Override
	public void stop() {
	System.out.println("스포츠 카가 멈춥니다.");	
	}

}
