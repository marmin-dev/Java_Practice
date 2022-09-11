package sec02.example08;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateIsEqualEx {

	public static void main(String[] args) {
		
		Predicate<Object> predicate = null;
		boolean result = false;
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//번지비교
		System.out.println(Objects.equals(obj1, obj2));
		
		//Predicate.isEqual()은 정적 메서드로써, 두 개의 객체의 값을 비교한다
		//둘다, null이면 true가 나오는게 좀 의아하다
		predicate = Predicate.isEqual(null);
		result = predicate.test(null);
		System.out.println("두객체가 null일때" +result);
		
		predicate = Predicate.isEqual(null);
		result = predicate.test("장개방");
		System.out.println(result);
		
		//아래의 코드 두 개의 번지를 비교하는 
		predicate = Predicate.isEqual(obj1);
		result = predicate.test(obj2);
		System.out.println("장개방과 장개방을 비교할때" +result); //주소비교
		System.out.println(Objects.equals("장개방", "장개방"));
		
		//위의 코드들은 대용량 데이터를 나중에 매핑하고 정렬하고 null값은 걸러내고 함수적 인터페이스를
		//선언하고 사용하면 편리한점과 코드의 간결성이 좋아진다
		
	}

}
