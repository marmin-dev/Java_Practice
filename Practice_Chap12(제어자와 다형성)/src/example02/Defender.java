package example02;
//자손클래스
public class Defender extends Player{
	
	private int def;

	public Defender(String name, int age, int backnumber, int speed, int def) {
		super(name, age, backnumber, speed); //player의 생성자
		this.def = def;
	}
	public int getDef() {
		return this.def;
	}
@Override
public void info() {
	super.info();//player의 info를 호출
	System.out.println("수비 횟수 : " + this.getDef());
}
	

	
	
	
	
}
