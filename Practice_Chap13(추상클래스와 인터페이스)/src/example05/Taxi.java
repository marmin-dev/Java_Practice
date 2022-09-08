package example05;

public class Taxi implements Vehiclelable{

	private int speed;//속도
	@Override
	public void run() {
		System.out.println("택시가" + this.speed +"km로 달립니다" );
	}

	@Override
	public void stop() {
		System.out.println("택시가 멈춥니다.");
		
	}

	@Override
	public void setSpeed(int speed) {
		if(speed < 0) {
			System.out.println("속도는 음수일리가 없죠!");
			return;
		}
		this.speed =speed;
	}

}
