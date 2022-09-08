package example04;

public class TimeEx {

	public static void main(String[] args) {
		
		Time t1 = new Time();
		//t1.hour = 10;
		System.out.println(t1);
		//시를 설정
		//프로그래밍을 할때, 멤버변수는 웬만하면 private 접근제어자로
		//감싸주고 (캠슐화), 각 멤버변수에 해당하는 getter()를 제공해주는
		//방법으로 클래스를 작성하는 방법이 올바르다.
		t1.setHour(50);
		t1.setMinute(30);
		t1.setSecond(50);
		System.out.println(t1);
	}

}
