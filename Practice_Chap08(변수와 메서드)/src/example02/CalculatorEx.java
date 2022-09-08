package example02;

public class CalculatorEx {

	public static void main(String[] args) {
		
	Calculator cal = new Calculator();
	int addresult = cal.add(100,200);
	System.out.println(addresult);
	
	long mulresult = Calculator.multiply(100, 20);
	//클래스명 .정적변수 명으로 접근을 해라
	//인스턴스 변수.정적변수로 하면? .err확률있음
	System.out.println(mulresult);
	//static 메서드 호출
	double divResult = Calculator.divide(100.88, 10.55);
	System.out.println(divResult);
	//Integer.parseInt("100");
	//Math.random();
	//정적 메서드의 예시(선언부에 static제어자가 붙어있다)--자바닥스 에서 확인
	}
	
}
