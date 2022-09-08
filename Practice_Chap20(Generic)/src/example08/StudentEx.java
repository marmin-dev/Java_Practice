package example08;

import javax.rmi.CORBA.StubDelegate;

public class StudentEx {

	public static void main(String[] args) {
		//필드의 다형성
		Person<String, String> person = new Student<String,String,Integer>();
		person.setKind("황인종");
		person.setMode("전투태세");
		
		System.out.println(person.getKind() + person.getMode() );
		
		Student<String, String,Integer> stu = new Student<String,String,Integer>();
		stu.setKind("황인종");
		stu.setMode("전투태세");
		stu.setC(100);
		System.out.println(stu.getKind() + stu.getMode() +"전투력" + stu.getC());
	}

}
