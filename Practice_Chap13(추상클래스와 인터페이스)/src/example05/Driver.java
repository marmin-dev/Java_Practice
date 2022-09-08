package example05;

public class Driver {
	//new Taxi()이거나 뉴버스만 들어올수가 있다
	//위 2개의 클래스가 베히클레브 인터페이스를 구현했기 때문에 들어올수가있다.
	public void drive(Vehiclelable vehiclelable) {
		vehiclelable.run();
		//System.out.println(vehiclelable);주소출력
	}
	//리턴타입 매개변수 타입이 전부 베히클라벨인터페이스 타입이다
	//그말의 뜻 리턴타입도 구현클래스가 와야하며 매개변수 타입도 역시
	//구현클래스가 와야한다.
	public void stop(Vehiclelable vehiclelable) {
		vehiclelable.stop();
	}
	public Vehiclelable newCarmethod(Vehiclelable vehiclelable) {
		if(vehiclelable instanceof Taxi) {
			Taxi taxi = (Taxi)vehiclelable;
			return taxi;
		}
		else if(vehiclelable instanceof Bus) {
			Bus bus = (Bus)vehiclelable;
			return bus;
		}
		return null;
	}
}
