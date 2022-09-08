package example02;

public class BitOperator {

	public static void main(String[] args) {
		
		//&,|,^ 3개를 비트 연산자라고 한다
		int x = -8;
		int y = 5;
		
		System.out.println("x를 2진수로" + Integer.toBinaryString(x));
		System.out.println("x를 2진수로" + Integer.toBinaryString(y));
		
		//&연산은 둘다 1이여야만 1이된다
		System.out.println("x와 y를 비트 엔드 연산결과" + (x & y));
		//&연산은 둘다 1일떄만 1을 준
		System.out.println("x와 y를 비트 오어 연산결과" + (x | y));
		//OR연산은 하나라도 1이면 1을 준
		System.out.println("x와 y를 비트 엔드 연산결과" + (x ^ y));
		//XOR 배타적 논리합 서로다를때 1을 준다
		
		//1의 보수를 취하고 y값과 엔드 오어 연산을 하면 왜 이렇게 나올까?
		//cpu가 생각하는 빼기값은 우리가 알고있는 빼기 값과 다르다.
	}

}
