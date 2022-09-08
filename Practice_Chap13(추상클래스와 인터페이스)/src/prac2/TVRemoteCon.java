package prac2;

public class TVRemoteCon implements RemoteCon{
	int volume=0;
	@Override
	public void turnOn() {
		System.out.println("TV ON");
	}

	@Override
	public void turnOff() {
		System.out.println("TV OFF");
	}
	public void volumeUp(int a) {
		volume += a;
		System.out.println("Current Volume : " + volume);
	}
	public void volumeDown(int a) {
		volume -= a;
		System.out.println("Current Volume : " + volume);
	}

}
