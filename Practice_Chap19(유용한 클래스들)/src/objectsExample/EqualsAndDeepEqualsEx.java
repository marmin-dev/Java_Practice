package objectsExample;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsEx {

	public static void main(String[] args) {
		
		Integer integer1 = new Integer(100);
		Integer integer2 = new Integer(100);
		//모든 포장클래세으서는 object클래스의 equals()오버라이딩이 되어있다
		System.out.println(integer1.equals(integer2));
		//전자는 인테져1을 기준으로 비교하는것이고
		System.out.println(Objects.equals(integer1, integer2));
		//후자는 양쪽을 둘다 매개변수로 한다
		//Objects 의 equals() 비교하는 2대상만 매개변수로 주면된다--유지보수혹은 개발 유리
		//얕은 비교이지만 인티져 클래스이기 때문에 상관읎다
		Integer[] arr1 = {new Integer(10), new Integer(30)};
		Integer[] arr2 = {new Integer(10), new Integer(30)};
		//Objects.equals()는 매개변수가 참조타입이 들어오면 주소비교(얕은비교)
		System.out.println(Objects.equals(arr1, arr2));
		//Objects.deepEquals()는 매개변수로 배열이 들어오면 깊은 비교(항목값)
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));
	}

}
