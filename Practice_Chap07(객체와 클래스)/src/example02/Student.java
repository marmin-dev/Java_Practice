package example02;

public class Student {

	String name;
	int age;
	
	
	
	
	
	
	//Object 클래스의 toString()오버라이딩 재정
	@Override
	public String toString() {
		
		return "이름 : " + this.name +"," +"나이 : " +this.age; 
		//this 클래스내에 숨겨진채 존재하는 변수
		//class의 주소를 가지고 있다.
		//클래스의 주소(new라 연산자가 인스턴스를 생성하면 비로소 활성화된다.)
		//this 는 static 메서드나 클래스안에서 사용이 불가능하다.
			}
	
}
