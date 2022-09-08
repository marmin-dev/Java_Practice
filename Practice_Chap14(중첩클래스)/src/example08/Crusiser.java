package example08;

public class Crusiser  implements Bike.Throttle{
int speed =80;
	@Override
	public void SpeedUp() {
		System.out.println("This is Cruiser");
		System.out.println("Current Speed" + this.speed);
	}
	
}
