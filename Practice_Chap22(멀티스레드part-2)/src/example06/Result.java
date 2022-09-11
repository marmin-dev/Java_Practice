package example06;
//공유객체
public class Result {
	
	private int accumValue;
	
	//공유객체 이기 떄문에, 데이터의 신뢰성을 위해서 싱크로나이즈드
	//여러가지 스레드가 접근할수 있으므로 동기화가 필수적이다
	public synchronized void addValue(int value) {
		this.accumValue +=value;
	}
	public synchronized int getValue() {
		return this.accumValue;
	}

}
