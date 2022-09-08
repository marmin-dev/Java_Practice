package example03;

//제네릭 클래스인데 타입 파라메터가 2개이다
public class Product<T, M> {

	private T t;
	private M m;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public M getM() {
		return m;
	}
	public void setM(M m) {
		this.m = m;
	}
//	@Override
//	public String toString() {
//		
//	
//	정확한 타입이 지정되지 않아서 투스트링 메서드를 만들기 어렵다
	
}
