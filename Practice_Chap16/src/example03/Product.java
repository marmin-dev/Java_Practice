package example03;

import java.util.Arrays;

//클래스의 복제가 가능하게 하려면, java.lang.cloneable을 구현해야한다
public class Product implements Cloneable{

	private String id;
	private String name;
	private int price;
	private int[] arr;
	
	public Product(String id, String name, int price, int[] arr) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.arr =arr;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	public int[] getArr() {
		return this.arr;
	}
	
	@Override
	public String toString() {
		return "상품 id" + this.getId() + "\n" +
			"상품 이름" + this.getName() + "\n" +
			"상품 가격" + this.getPrice() + "\n" +
			"배열값" + Arrays.toString(arr); 
		
	}
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//	
//		return super.clone();
//	}
	public Product getProduct() {
		Product cloned = null;
		try {
			//얕은 복제가 여기서 일어난다.(참조변수의 값들은 번지공유)
			cloned = (Product)this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}//오브젝트의 클론호출
		return cloned;
	}
	
	
	
}
