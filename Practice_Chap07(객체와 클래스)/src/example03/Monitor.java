package example03;

public class Monitor {
 //멤버변수(필드)
	String color; //모니터의 색상
	int channel; //채널
	boolean power;//전원 on off
	int volume;
	
	//멤버메서드
	//Monitor 을 켜거나 끄는 기능을 하는 메서드.
	public void power() {
		
		if(!this.power) {
			System.out.println("모니터가 켜졌습니다.");
		}
		else {
			System.out.println("모니터가 꺼졌습니다.");
		}
		this.power = !power;
		
	}
	
	public void channelUp() {
		this.channel++;
		System.out.println("현재 채널 : "+channel);
	}
	public void channelDown() {
		//this.channel++;
		System.out.println("현재 채널 : "+(--channel));
	}
	
	public void volumeUp() {
		System.out.println("현재 채널 : "+(--volume));
	}
	public void volumeDown() {
		System.out.println("현재 채널 : "+(++volume));
	}
	
	
	
	
	@Override
		public String toString() {
		
			return "현재 채널 : " + this.channel + "현재 볼륨" + this.volume;
		}
}
