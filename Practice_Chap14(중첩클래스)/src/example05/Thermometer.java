package example05;

public class Thermometer {

	//중첩인터페이스 선언
	interface TempretureChangable{
		public void OnChange();
	}
	TempretureChangable changeabe;
	
	//매개 변수타입이 인터페이스 타입이 들어왔다. 이것은 무엇을 의미하는가
	//즉 tempretureChangeable인터페이스를 구현한 클래스만 들어올수 있다
	//인터페이스 매개변수의 다형성이다
	public void setChangeabe(TempretureChangable changeabe) {
		this.changeabe = changeabe;
	}
	public void viewTempreture() {
		this.changeabe.OnChange();
	}
	
	
}
