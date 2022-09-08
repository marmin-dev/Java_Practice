package example09;
//인터페이스 일종의 조상이기 떄문에 인페가 제네릭이면
//클래스도 제네릭이어야한다
public class Storage<T> implements Storable<T> {

	private T[] arr;
	public Storage(int size) {
		this.arr = (T[]) new Object[size];
	}
	@Override
	public void add(T item, int index) {
		this.arr[index] = item;
		
	}

	@Override
	public T get(int index) {
		return this.arr[index];
	}
	
	

}
