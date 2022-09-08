package prac2;

public class User {
	public void use(RemoteCon remote) {
		System.out.println("Using Remote con");
	}
	public void turnon(RemoteCon remote) {
		remote.turnOn();
	}
	public void turnoff(RemoteCon remote) {
		remote.turnOff();
	}
	public void dischar(RemoteCon remote) {
		remote.discharge();
	}

}
