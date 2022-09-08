package example02;

import java.util.List;
import java.util.Vector;

public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		
		//자동박싱
		Integer obj1 = 100;
		Integer obj2 = 300;
		
		List list = new Vector();
		list.add(obj1);
		list.add(obj2);
		list.add(500);
		System.out.println(list);
		
		int value1=(Integer) list.get(0);
		System.out.println(value1);
		
		int value2= obj2;//자동언박싱
		System.out.println(value2);
		//객체 + 기본타입은 신택스 에러이다
		//포장클래스이기 떄문에 컴파일러가 자동 언박싱을 해주기 때문에 아래와같은
		//코드가 가능하다
		int result = obj1+500;
		System.out.println(result);
	}

}
