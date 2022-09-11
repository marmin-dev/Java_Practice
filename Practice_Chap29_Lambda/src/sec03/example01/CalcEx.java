package sec03.example01;

import java.util.function.IntBinaryOperator;

public class CalcEx {

	public static void main(String[] args) {
		
		//IntBinaryOperator는 int 값이 2개가 있고 리턴타입의 일치 2개의 int값 매개변수를 받아 연산하여 
		//하나의 int값으로 리턴하는 int applyAsInt(int,int)추상 메서드를 가지고있다
		//하여 람다식으로 구현을 하면 아래와 같다
		IntBinaryOperator binaryOperator = null;
		
		//람다식
		binaryOperator = (x,y) -> {
			return Calc.saddMethod(x, y);
		};
		System.out.println("결과 1 : " +binaryOperator.applyAsInt(100, 200));
		
		//메서드 참조 형태
		//번거롭게 람다식으로 구현을 할때 매개변수를 2번 적어주어야한다는 것을줄이기 위해서
		//아래와 같이 메서드 참조로 코딩을 하면 코드의 양을 줄일 수 있다라는 장점으로 고안된 방법이다
		binaryOperator = Calc::saddMethod;
		System.out.println("람다식 결과 : " + binaryOperator.applyAsInt(100, 200));
		
		//람다식
		binaryOperator = (x,y) -> {
			return Calc.smulMethod(x, y);
		};
		System.out.println("결과 1 : " +binaryOperator.applyAsInt(100, 200));
		
		//메서드 참조 형태
		//번거롭게 람다식으로 구현을 할때 매개변수를 2번 적어주어야한다는 것을줄이기 위해서
		//아래와 같이 메서드 참조로 코딩을 하면 코드의 양을 줄일 수 있다라는 장점으로 고안된 방법이다
		binaryOperator = Calc::smulMethod;
		System.out.println("람다식 결과 : " + binaryOperator.applyAsInt(100, 200));
		
		Calc calc = new Calc();
		
		//람다식 구현
		binaryOperator = (x,y)->{return calc.imethod(100,200);};
		System.out.println(binaryOperator.applyAsInt(100, 200));
		
		//메서드 참조
		binaryOperator = calc::imethod;
		System.out.println("메서드 참조" + binaryOperator.applyAsInt(100, 200));
		
		//1.참조할 메서드의 매개변수와 리턴값이 무엇인지를 일단 먼저 명확하게 파악을 한다
		//파악한것을 토대로 적합한 함수적 인터페이스를 찾는다
		//그다음 정적인지 인스턴스 메서드인지 확인해서 메서드를 참조하는것으로 익명구현객체를 만든다
		
		//결론: 메서드 참조역시도 익명구현 객체를 만드는 것으로, 함수적 인터페이스에 대입이 가능하다는것이고,
		//아울러 매개변수와 리턴값이 맞는 것을 타겟타입으로 하여 구현해야 하는것이다
		//그렇게 하면 코드가 줄어들고 데이터도 빠르게 처리가 가능해진다
	}

}
