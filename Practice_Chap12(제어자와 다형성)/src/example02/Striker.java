package example02;
//자손클래스
public class Striker extends Player{
	
	private int shoot;

	public Striker(String name, int age, int backnumber, int speed, int shoot) {
		super(name, age, backnumber, speed); //player의 생성자
		this.shoot = shoot;
	}
	public int getShoot() {
		return this.shoot;
	}
@Override
public void info() {
	super.info();//player의 info를 호출
	System.out.println("유효 슛팅 : " + this.getShoot());
}
	

	
	
	
	
}
