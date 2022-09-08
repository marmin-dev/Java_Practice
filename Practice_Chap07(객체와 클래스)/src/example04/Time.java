package example04;

public class Time {
//접근제어자의 종류(access modifier)
//private:같은 클래스내에서만 접근이 가능하다.
//protected 같은패키지, 자손클래스에서만 접근이 가능하다.
//default:같은 패키지에서만 접근이 가능하다.
//public 누구나 다 접근이 가능하다.

	private int hour;
	private int minute;
	private int second;
	//getter() method
	public int getHour() {
		return this.hour;
	}
	//source tab -> generate getter and setter 클릭 후
	//원하는 멤버변수를 체크해서 getter 와 setter 메서드를
	//자동 완성을 하면 된다.
	//getter method는 값을 읽어가는 메서드이고
	//setter method는 멤버변수의 값을 수정하는 메서드이다.
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if(minute<0||minute>59)
		{return;}
		this.minute = minute;
	}
	
	public int getSecond() {
		return this.second;
		
	}
	
	public void setSecond(int second) {
		if(second<0||second>59)
		{return;}
		this.second = second;
	}
	//시에 대한 예외처리 코드를 작성
	public void setHour(int hour) {
		if(hour<0||hour>23)
		{return;}
		this.hour = hour;
	}
	
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getHour() + "시 " + this.getMinute()+"분 "
				+ this.getSecond() + "초";
	}

}
