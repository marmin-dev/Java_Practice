package example05;

public class VehiclelableEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		bus.setSpeed(-50);
		bus.setSpeed(80);
		//직접 만들어서 참조변수(주소)를 넘기는것
		driver.drive(bus);
		
		System.out.println();
		
		taxi.setSpeed(-10);
		taxi.setSpeed(100);
		driver.drive(taxi);
		
		System.out.println();
		//이렇게 직접 매개변수를 생성하여 넘기는 방법
		driver.drive(new Taxi());
		driver.drive(new Bus());

		driver.stop(taxi);
	//	driver.drive(new AIcar());
		//ai카는 베히클러블이라는 인터페이스를 구현하지 않았기 때문에
		System.out.println();
		
		Vehiclelable vehiclable = driver.newCarmethod(new Taxi());
		vehiclable.run();
		vehiclable.stop();
		
		vehiclable = driver.newCarmethod(new Bus());
		vehiclable.run();
		vehiclable.stop();
		
		
	}

}
