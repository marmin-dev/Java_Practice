package sec02.example04;

import java.util.ArrayList;
import java.util.function.ToIntFunction;

public class FunctionEx02 {

	public static ArrayList<Student> arraylist = new ArrayList<>();
	
	public static void main(String[] args) {
		
		arraylist.add(new Student("김길환","대구",95,80));
		arraylist.add(new Student("안승범","서울",90,88));
		arraylist.add(new Student("장개방","맥도",44,78));
		arraylist.add(new Student("탈모탄조","빅시티",15,80));
		
		ToIntFunction<Student> toIntFunction = t->{
		return t.getEnglishScore();	
		};
		average(toIntFunction, "영어");
		
		//실행블럭에서 어떤 메서드를 호출하냐에 따라 점수가 달라짐을 확인할수 있어야한다(영어)
		ToIntFunction<Student> toIntFunction1 = t->{
			return t.getMathScore();	
			};
			average(toIntFunction1, "수학");

	}
	//average()에서 매개변수타입이 ToIntFunction<Student>를 구현한 객체가 넘어와야한다
	public static void average(ToIntFunction<Student> function,String str) {
		
		int sum =0;
		double avg = 0.0;
		
		for(Student student : arraylist) {
			int score = function.applyAsInt(student);
			sum += score;
		}
		avg = (double)sum/arraylist.size();
		System.out.println(str+"점수평균"+avg);
		System.out.println();
	}

}
