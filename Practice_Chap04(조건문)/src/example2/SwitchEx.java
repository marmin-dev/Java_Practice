package example2;

public class SwitchEx {

	public static void main(String[] args) {
		
		int score = 95;
		
		switch(score/10) {
		case 9:
			System.out.println("90점대 입니다");
			break;
		case 8:
			System.out.println("80점대 입니다");
			break;
		case 7:
			System.out.println("70점 입니다");
			break;
		default:
			System.out.println("잘못된 값입니다");
		//break 가 없다면 모두 출력된다
			
		}

	}

}
