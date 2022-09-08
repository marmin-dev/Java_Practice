package example07;

public class User2 extends Thread{
	//공유 객체 선언
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		this.setName("User-2");
	}
	
	@Override
	public void run() {
	//공유객체의 필드인 메모리에 100을 변경
	this.calculator.print();
	this.calculator.setMemoy(50);
	
	}

}
