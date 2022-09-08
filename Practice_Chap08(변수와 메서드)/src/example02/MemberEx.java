package example02;

public class MemberEx {

	public static void study() {
		System.out.println("자바 공부를 합니다");
	}
	public void m1() {
		System.out.println("인스턴스 메서드");
	}
	
	
	public static void main(String[] args) {
		
		//아래는 static멤버들이므로 인스턴스 생성없이, 얼마든지 클래스명.정적멤버
		//명으로 접근이 가능하다라는 것을 보여주고 있다.
		Member.smethod();
		Member.cv = 500;
		Member.smethod();
		//인스턴스 멤버들을 사용하기 위해서는 반드시 new 라는 연산자가 힙에다가
		//인스턴스를 만들어야 사용이 가능하다
		MemberEx.study();
		MemberEx me = new MemberEx();
		me.m1();
		Member m = new Member();
		m.imethod();
		m.iv=999;
		m.imethod();
		//m.cv = 500; 올바르지 않은 접근방법이다
		//static은 static만 호출이 가능하다.
	}

}
