package example03;

public class Product {

	static int number = 0;
	int countNo;
	int[] arr = new int[10];
	//인스턴스 초기화 블럭(정적멤버 사용할수있음)
	static{
		System.out.println("정적 초기화 블럭 호출됨");
	}
	{
		System.out.println("인스턴스 초기화 블럭 호출됨");
		++number;
		this.countNo = Product.number;
		//복잡한 초기화 같은 경우에는 초기화 블럭 실행문을 만들면 가독성이 좋아진다.
		for(int i=0;i<arr.length;i++) {
		this.arr[i] = (int)(Math.random()*10)+1;
		}
	}
	public Product() {
	System.out.println("기본생성자 호출됨");
	}
}
