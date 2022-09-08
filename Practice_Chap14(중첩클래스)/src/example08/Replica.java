package example08;

public class Replica  implements Bike.Throttle{
int speed =100;
	@Override
	public void SpeedUp() {
		System.out.println("This is RRRRREplica");
		System.out.println("Current Speed" + this.speed);
	}
	
}
