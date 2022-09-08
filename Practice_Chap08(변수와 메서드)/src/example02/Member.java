package example02;

public class Member {

	int iv =100;	//인스턴스 멤버변수
	static int cv = 200; //static 멤버변수
	//인스턴스 메서드
	public void imethod()
	{
		System.out.println("iv : " + this.iv);
		//System.out.println("cv : " + Member.cv); //클래스명.정적변수명
		//인스턴스메서드에선 스태틱호출이 가능하다. 인스턴스가 생성된 이후이기 떄문이다.
	}
	//static 메서드
	public static void smethod() {
		//인스턴스가 만들어져야 활성 언제 인스턴스가 만들어질지는 아무도 모르기때문.
		//System.out.println("iv : " + this.iv);
		
		//cv는 static 변수이기때문에 인스턴스생성없이도 접근가능해야하는데
		//static 메서드내에서는 얼마든지 접근이 가능하다.
		//곧 스태틱 메서드내에서는 인스턴스값이 들어갈수없다.
		System.out.println("cv : " + Member.cv);
		
	}
	
	
}
