package example04;

public class Television implements RemoteControl {

	public int volume;
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		//볼륨이 0에서 10사이에서만 움직일것으로 프로그래밍함
				if(volume > RemoteControl.MAX_VOLUME) {
					System.out.println("TV 볼륨의 최대치 값은 10입니다");
					this.volume=RemoteControl.MAX_VOLUME;
				}
				else if(volume < RemoteControl.MIN_VOLUME) {
					System.out.println("TV 볼륨의 최소치 값은 0입니다");
					this.volume =RemoteControl.MIN_VOLUME;
				}
				else {
					this.volume = volume;
				}
				System.out.println("현재 TV 볼룸: "+this.volume);
				
		
	}
	
	

}
