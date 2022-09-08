package example08;

public class Bike {
	interface Throttle{
		public void SpeedUp();
	}
	Throttle excel;
	
	public void setSpeed(Throttle excel) {
		this.excel=excel;
	}
	public void viewSpedd() {
		this.excel.SpeedUp();
	}
}
