package example01;

public class CardEx {
	
	public static void main (String[] args)
	{
		
		
		Card card1 = new Card();
		card1.setColor("노란색");
		card1.setCompany("국민은행");
		System.out.println(card1);
		card1.show();
		//static변수는 반드시 클래스명.static변수명으로 접근하여야함.
		//웬만하면, 공유변수는 분석하는 단계에서는 바꾸지 않는게 바람직하다.
		//card1.width=80;
		//card1.height=50;
		//공유변수는 인스턴스 없이도 접근이 가능하다.
		Card card2 = new Card();
		card2.setColor("파랑");
		card2.setCompany("농협");
		System.out.println(card2);
	}

}
