package example02;
//조상클래스
public class Player {
	
	//멤버변수
private String name;
private int age;
private int backnumber;
private int speed;
//생성자
public Player(String name, int age, int backnumber, int speed) {
	super();//object 클래스의 생성자를 호출
	this.name = name;
	this.age = age;
	this.backnumber = backnumber;
	this.speed = speed;
}

public String getName() {
	return name;
}

public int getAge() {
	return age;
}

public int getBacknumber() {
	return backnumber;
}

public int getSpeed() {
	return speed;
}

public void info() {
	System.out.println("이름 : "+this.getName());
	System.out.println("나이 : "+this.getAge());
	System.out.println("등번호 : "+this.getBacknumber());
	System.out.println("속도 : "+this.getSpeed());
}
}
