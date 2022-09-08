package example07;

public class User1 extends Thread{
	//공유 객체 선언
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		this.setName("User-1");
	}
	
	@Override
	public void run() {
		this.calculator.print();
	//공유객체의 필드인 메모리에 100을 변경
	this.calculator.setMemoy(100);
	
	}

}
