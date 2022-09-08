package example06;

public class B implements I{
	
//I인터페이그를 구현함으로 A클래스와 간접적 관계
	//제공하는측(구현)
	
	@Override
	public void method () {
		System.out.println("인터페이스 I를 구현한 B클래스에서 호출");
		
	}

}
