package example04;

public class CarEx {

	public static void main(String[] args) {
		Car car =new Car(80);
		car.speedUp();
		car.speedDown();
		car.stop();
		
		SportCar sportCar = new SportCar (150);
		sportCar.speedUp();//조상클래스의 스피드업을 호출
		sportCar.speedDown();
		sportCar.stop();//자손클래스의 stop을 호출

	}

}
 