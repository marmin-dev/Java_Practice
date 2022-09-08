package example02;
//추상클래스 이면서 조상클래스
public abstract class Phone {

	private int serial_No;
	private String owner;
	private String company;
	//생성자
	public Phone(int serial_No, String owner, String company) {
		super();
		this.serial_No = serial_No;
		this.owner = owner;
		this.company = company;
	}
	
	public int getSerial_No() {
		return serial_No;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public String getCompany() {
		return company;
	}
	//추상메서드 선언
	public abstract void turnOn();
	public abstract void turnoff();

	public void showInfo() {
		System.out.println("시리얼 넘버 : "+ this.getSerial_No());
		System.out.println("주인 : "+ this.getOwner());
		System.out.println("회사 : "+ this.getCompany());
	}
	
	
}
