package objectsExample;

import java.util.Comparator;
import java.util.Objects;

public class CompareEx {
	//중첩클래스(정적멤버클래스)
	static class Student{
		int sno;
		String name;
		public Student(int sno, String name) {
			super();
			this.sno = sno;
			this.name = name;
		}
	}
	static class StudentComparator implements Comparator<Student>{
		
		@Override
		public int compare(Student o1, Student o2) {
			if(o1.name.compareTo(o2.name)<0) {
				return -1;
			}
			else if(o1.name.compareTo(o2.name)==0) {
				return 0;
			}
			else {
				return 1;
			}
			
		}
	}

	public static void main(String[] args) {
		
		Student student1 = new Student(1,"홍길환");
		Student student2 = new Student(1,"홍길환");
		Student student3 = new Student(3,"김길형");
		//객체 배열자등을 만들때 정렬기준을 직접 주는것
		//오름차순이든 내림차순이든 정렬을 하는데 기준을 주는것이다
		
//		int result = Objects.compare(student1, student3, new Comparator<Student>() {
//비교자 컴패어러터 인터페이스를 익명구현객체로 대입
//			@Override
//			public int compare(Student o1, Student o2) {
////				if(o1.sno<o2.sno) {
////					return -1;
////				}
////				else if(o1.sno==o2.sno) {
////					return 0;
////				}
////				else {
////					return 1;
//				//두가지 어떻게 표현하든 상관없다
//				return o1.sno - o2.sno;
//				
//			}
//		});
//	비교자가 들어가야 sort가 가능하다
//	비교자 컴페어 러터를 가지고 비교하는것이 좋다	
	int result=	Objects.compare(student1, student2, new StudentComparator());
	if(result > 0) {
		System.out.println("o1의 sno가 큽니다. ");
	}
	else if(result == 0) {
		System.out.println("o1과 o2의 sno가 같습니다");
	}
	else {
		System.out.println("o2의 sno가 o1의 sno보다 큽니다");
	}
	}

}
