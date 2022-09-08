package example02;

public class PhoneEx {

	public static void main(String[] args) {
		
		Phone[] p= new Phone[10];
		p[0] = new SmartPhone(1001,"Rex","LG");
		p[0].showInfo();
		//인터넷 서치 기능은 사용이 불가능하다 . 자손클래스 멤버변수이기 때문이다.
		
		
		Phone phone1 = new SmartPhone(1001,"Rex","LG");
		phone1.showInfo();
		phone1.turnOn();

	}

}
