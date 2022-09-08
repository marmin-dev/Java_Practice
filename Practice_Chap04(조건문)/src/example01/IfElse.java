package example01;

public class IfElse {

	public static void main(String[] args) {
		//몇 개의 조건문이 존재하더라도 모든 이프문을 참조한다 
		//매우 비효율 적인 코드가 된다.
		int score = 93;
		/*
		 * int score = 93; if(score > 90) { System.out.println("점수가 90보다 큽니다");
		 * System.out.println("등급은 A입니다");
		 * 
		 * } if(score > 80) { System.out.println("점수가 90보다 큽니다");
		 * System.out.println("등급은 A입니다"); }
		 */
		//else 구문 옆에는 조건문이 절대로 오면 안된다.
		//if else 구문은 조건문이 절대로 오면 안된다
		//구문안에 있는 블럭이 한문장일때는 세미콜론만 사용해도 되지만...
		//두문장으로 늘어나게 되면 문제가 생길수 있
		if(score>=90) {
			System.out.println("90점 이상입니다");
		}
		else {
			System.out.println("80점 이상입니다");
		}
	}

}
