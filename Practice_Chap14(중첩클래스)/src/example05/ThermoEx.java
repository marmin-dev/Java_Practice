package example05;

import example05.Thermometer.TempretureChangable;

public class ThermoEx {

	public static void main(String[] args) {
		
		Thermometer thermometer = new Thermometer();
		thermometer.setChangeabe(new AnalogThermo());
		thermometer.viewTempreture();
		
		thermometer = new Thermometer();
		thermometer.setChangeabe(new DigitalThermo());
		thermometer.viewTempreture();
		//인터페이스 다형성 중첩인터페이스
		
		TempretureChangable thermometer2 = new Thermometer.TempretureChangable() {
			
			@Override
			public void OnChange() {
			System.out.println("익명 구현 객체로 만든");
				
			}
		};
		//내부적으로 실행을 하고싶다면?
		//중첩인터페이스이므로 익명구현객체를 얻는것은 안된다
	}

}
