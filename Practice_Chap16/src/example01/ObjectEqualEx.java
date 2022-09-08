package example01;

public class ObjectEqualEx {

	public static void main(String[] args) {
		
		//Object클래스의 equals()
		//아래 코드는 서로 주소가 다다르다.
		Object object1 = new Object();
		Object object2 = new Object();
		//object클래스의 equals는 메모리번지 비교 
		boolean result1 = object1.equals(object2);
		boolean result2 = (object1==object2);
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(result1);
		System.out.println(result2);
		
		
		
	}

}
