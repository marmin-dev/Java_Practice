package example02;

public class Point {
int x;
int y;

public Point() {
this(0,0);//또다른 생성자 호출
}
//매개변수가 있는 생성자
public Point(int x, int y) {
	System.out.println("Point클래스의 매개변수가 있는 생성자 호출");
	this.x=x;
	this.y=y;
}
}
