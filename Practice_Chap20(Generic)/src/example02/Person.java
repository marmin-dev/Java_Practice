package example02;
//Person이라는 클래스를 제네릭타입으로 설계함
public class Person<T> {
	//T라는 타입이 아직 정해지지 않았다
	//T라는 코드는 개발코드에서 정해진다
	//하여,Static은 올수가 없다 타입이 정해지지 않았기 떄문에
	private T t;

	public Person() {
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
