package example03;

public class USBMemory extends HddDisk{
	//멤버변수
	int capacity;
	int rpm;
	public USBMemory() {
		
	}
	//생성자
	public USBMemory(int capacity, int rpm) {
		this.capacity = capacity;
		this.rpm = rpm;
	}
	
	public String status(int i) {
		String str = "USB 용량 : " +	i +"\n" +
				"USB 속도 : " +this.rpm + "(rpm)";
	return str;
	}
	
	
	
	//조상클래스의 메서드를 오버라이딩 함
	@Override
	public String status() {
		String str = "USB 용량 : " +	this.capacity +"\n" +
				"USB 속도 : " +this.rpm + "(rpm)";
	return str;
	}
}
