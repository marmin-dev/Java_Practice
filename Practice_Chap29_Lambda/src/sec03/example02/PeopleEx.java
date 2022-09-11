package sec03.example02;

import java.util.function.BiFunction;
import java.util.function.Function;

public class PeopleEx {

	public static void main(String[] args) {
		
		Function<String, People> function1 = (x) ->{
			return new People(x);
		};
		People people =function1.apply("장개방");
		System.out.println(people);
		
		
		function1 = People::new;
		people = function1.apply("장개방");
		System.out.println(people);
		
		BiFunction<String, Integer, People> function2 =
				(x,y) ->{return new People(x,y);};
		people = function2.apply("김길환", 12);
		System.out.println(people);
		
		//생성자 참조
		function2 = People::new;
		people = function2.apply("장개방", 24);
		System.out.println(people);
	}

}
