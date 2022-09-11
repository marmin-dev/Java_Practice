package sec02.example08;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateEx {

	public static void main(String[] args) {
		
		IntPredicate predicateA = x->{ //2의 배수를 구하는 람다식
			return (x%2) == 0;
		};
		IntPredicate predicateB = x->{ //3의 배수를 구하는 람다식
			return (x%3) == 0;
		};
		System.out.println("15 는 2의 배수인가?? : "+predicateA.test(15));
		System.out.println("15 는 3의 배수인가?? : "+predicateB.test(15));
		
		//and()는 둘다 true여야 true를 리턴한다
		IntPredicate predicateAB = predicateA.and(predicateB);
		System.out.println("6은 2와 3의 공배수인가? " + predicateAB.test(6));
		
		//or()는 둘중하나라도 true여야 true를 리턴한다
		predicateAB = predicateA.or(predicateB);
		System.out.println("7은 2나 3의 배수인가? " + predicateAB.test(7));
		
		//negate()는 true이면 false를 리턴히고 false이면 true를 리턴한다
		predicateAB = predicateA.negate();
		System.out.println("9는 홀수인가여?" + predicateAB.test(9));
		
		
	}

}
