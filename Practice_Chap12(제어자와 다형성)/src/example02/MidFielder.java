package example02;
//자손클래스
public class MidFielder extends Player{
	
	private int pass;

	public MidFielder(String name, int age, int backnumber, int speed, int pass) {
		super(name, age, backnumber, speed); //player의 생성자
		this.pass = pass;
	}
	public int getPass() {
		return this.pass;
	}
@Override
public void info() {
	super.info();//player의 info를 호출
	System.out.println("패스 횟수 : " + this.getPass());
}
	

	
	
	
	
}
