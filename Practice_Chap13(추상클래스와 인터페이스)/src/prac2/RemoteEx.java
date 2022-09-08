package prac2;

public class RemoteEx {

	public static void main(String[] args) {
		RemoteCon re = new TVRemoteCon();
		re.turnOn();
		re.turnOff();
		re.discharge();
		TVRemoteCon tv = new TVRemoteCon();
		tv.volumeUp(20);
		tv.volumeDown(6);
		
		PanRemoteCon pan = new PanRemoteCon();
		User user = new User();
		user.turnon(re);
		user.turnoff(re);
		user.turnoff(pan);
		user.turnoff(pan);

	}

}
