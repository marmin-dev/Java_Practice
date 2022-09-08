package example01;

public class Card {
	//	인스턴스 변수
	private String color;	//카드의 색상
	private String company; //카드의 회사
	//static변수(정적,클래스, 공유변수) --인스턴스 생성 없이도 클래스명 .static변수명 접근가능
	static int width = 100; //카드의 폭
	static int height=50;	//카드의 높이
	
	//getter , setter 인스턴스 메서드 
	public String getColor() {
		
		
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void show() {//여기에스태틱을 붙히면?
		//지역변수는 반드시 초기화를 해야한다.
		//메서드 안에 static 변수를 사용하지 못한다, 그 이유는
		//static 특성은 인스턴스 생성없이도 얼마든지 접근가능해야하는데,
		//언제 인스턴스가 생성될지 아무도 모르기 때문에 이렇게 코드를 작성하는것은
		//올바른 방법이 아니다
		int i=0;
		String color = this.color;
		String company = this.company;
		System.out.println(color +","+company);
	}
	
	@Override
	public String toString() {
		//정적변수는 접근방식이 반드시 클래스명 .static 변수명으로 접근을 해야
		//올바른 방법이다.
		return "card1의 색상" + this.getColor() + "card1의 회사" + this.getCompany() +
				"크기 : (" + Card.height+ "," + Card.width+")";
	}
	
	
	
	
	
}
