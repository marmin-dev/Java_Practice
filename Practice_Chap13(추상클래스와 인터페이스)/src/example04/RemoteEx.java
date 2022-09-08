package example04;

public class RemoteEx {

	public static void main(String[] args) {
		//인터페이스도 일종의 조상으로 필드의 다형성이 허용된다
	RemoteControl tv = new Television();
	tv.turnOn();
	tv.setVolume(15);
	tv.setVolume(-100);
	tv.turnOff();
	
	tv = new Audio();
	tv.turnOn();
	tv.setVolume(15);
	tv.setVolume(-100);
	tv.turnOff();
	}

}
