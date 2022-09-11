package sec02.example06;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateEx {
	
	public static ArrayList<Student> arrayList = new ArrayList<>();

	public static void main(String[] args) {
		
		arrayList.add(new Student("김길환", "남자", 20));
		arrayList.add(new Student("김정일", "여자", 30));
		arrayList.add(new Student("송길혁", "남자", 80));
		arrayList.add(new Student("장개방", "여자", 70));
		arrayList.add(new Student("김근육", "남자", 20));
		
		//Predicate<T>함수적 인터페이스는 test()의 추상메서드의 실체를 람다식으로 아래와같이
		//구성하였고 남자이냐 여자이냐에 따라서 값이 역시 달라짐을 확인이 가능하다
		
		Predicate<Student> predicatemale = t->{
			return t.getSex().equals("남자");
		};
		double maleavg = avg(predicatemale);
		System.out.println(maleavg);
		
		Predicate<Student> predicatefemale = t->{
			return t.getSex().equals("여자");
		};
		double femaleavg = avg(predicatefemale);
		System.out.println(femaleavg);

	}
	//Predicate<T>함수적 인터패이스는 test의 추상메서드를 가지고있다
	//아울러 매개변수로 Predicate<Student>이다 하여 호출하는 곳에서는
	//predicate<Student>의 추상메서드 test()구현한 객체를 받아야 하는것이다
	public static double avg(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		
		for(Student student:arrayList) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double) sum/count;
	}

}
