package example05;

public class Bus implements Vehiclelable{

	private int speed;

	@Override
	public void run() {
		System.out.println("버스가"+this.speed+"km 속도로 달립니다");
		
	}

	@Override
	public void stop() {
		System.out.println("버스가 멈춥니다");
		
	}

	@Override
	public void setSpeed(int speed) {
		if(speed<0) {
		System.out.println("속도가 음수일리없지");}
		this.speed=speed;
	}

}
