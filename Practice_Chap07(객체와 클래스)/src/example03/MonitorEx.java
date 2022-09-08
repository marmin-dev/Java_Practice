package example03;

public class MonitorEx {

	public static void main(String[] args) {
		//참조변수는 리모컨과 같은것이라고 생각하자.
		Monitor monitor = new Monitor();
		monitor.power();
		monitor.power();
		monitor.power();
		
		monitor.channelUp();
		monitor.channelUp();
		monitor.channelDown();
		monitor.power();
		
		System.out.println(monitor.toString());
		System.out.println(monitor);
	}

}
