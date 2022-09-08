package example05;

public class DigitalThermo implements Thermometer.TempretureChangable{
//중첩인터페이스를 구현한 클래스
	int temperature = 50;
	@Override
	public void OnChange() {
		System.out.println("전자 온도계입니다");
		System.out.println(this.temperature+"도 입니다");
	}

	
}
