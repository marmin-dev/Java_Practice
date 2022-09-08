package examexam01;

public class ObjectEqualsEx {

	public static void main(String[] args) {
		//Object 클래스의 equals()
		//아래 코드는 서로 주소가 다르다
		Object object1 = new Object();
		Object object2 = new Object();
		//Object 클래스의 이퀄즈는 원론적으로 메모리 번지 비교
		
		
		System.out.println(object1);
		System.out.println(object2);
		boolean result =object1.equals(object2);
		boolean result2= (object1==object2);
		System.out.println(result);
		System.out.println(result2);
		

	}

}
