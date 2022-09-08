package prac2;

public class PanRemoteCon implements RemoteCon {

	@Override
	public void turnOn() {
		System.out.println("Pan On");
	}

	@Override
	public void turnOff() {
		System.out.println("Pan Off");
	}

}
