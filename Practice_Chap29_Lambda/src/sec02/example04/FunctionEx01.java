package sec02.example04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionEx01 {
	
	private static List<Student> list = Arrays.asList(
			new Student("김길환","분당", 100, 55),
			new Student("우종길","서울", 90, 98),
			new Student("김근육","월수", 80, 92),
			new Student("장개방","맥두날도", 81, 99));

	public static void main(String[] args) {
		
		Function<Student, String> function = t->{
			return t.getName() + t.getAdress() + "\t";
		};
		printString(function);
		ToIntFunction<Student> function1 = a->{
			return a.getEnglishScore() +  a.getMathScore();
		};
		intPrint(function1);
	}
	
	//function<T, R> 함수적 인터페이스는 T를 매개값으로 하여,R로 매핑하여 리턴하는 인터페이스이다
	//여기서는 곧 PrintString의 매개변수 타입이 Function<T,R> 함수적 인터페이스를 구현한 람다식이
	//넘겨주어야 한다
	public static void printString(Function<Student, String> function) {
		
		for(Student student : list) {
			String str = function.apply(student);
			System.out.println("이름 : "+str +"\t");
		}
	}
public static void intPrint(ToIntFunction<Student> function) {
		
		for(Student student : list) {
			int val = function.applyAsInt(student);
			System.out.println("점수 : "+val +"\t");
		}
	}

}
