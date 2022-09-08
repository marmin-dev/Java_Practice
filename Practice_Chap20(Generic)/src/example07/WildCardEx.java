package example07;

import java.util.Arrays;


public class WildCardEx {
	//?는 어떠한 타입이든 다받겠다
	public static void registercourse(Course<?> course) {
		System.out.println(course.getName() +"수강생 : "+ 
Arrays.toString(course.getStudents())	);
	}
	 //상위타입제한
		public static void registercourseStudent(Course<?extends Student> course) {
			System.out.println(course.getName() +"수강생 : "+ 
	Arrays.toString(course.getStudents())	);
		}
		//워커클래스이거나 사이클래스는 들어올수있다 하위타입제한
		public static void registercourseWorker(Course<?super Worker> course) {
			System.out.println(course.getName() + "수강색 : "+ 
		Arrays.toString(course.getStudents()));
		}

	public static void main(String[] args) {
		
//		registercourse(new Course<Person>("일반인 과정", 5));
//		registercourse(new Course<Student>("학생 과정", 10));
//		registercourse(new Course<Worker>("노동자 과정", 8));
//		registercourse(new Course<HighStudent>("고등학생 과정", 4));

//		//	registercourseStudent(new Course<Person>("일반인 과정", 5));
//		registercourseStudent(new Course<Student>("학생 과정", 10));
//		//	registercourseStudent(new Course<Worker>("노동자 과정", 8));
//		registercourseStudent(new Course<HighStudent>("고등학생 과정", 4));
//
//		registercourseWorker(new Course<Person>("일반인 과정", 5));
//		//registercourseWorker(new Course<Student>("학생 과정", 10));
//		registercourseWorker(new Course<Worker>("노동자 과정", 8));
//		//registercourseWorker(new Course<HighStudent>("고등학생 과정", 4));
		
		//직접 coures 생성을 해서 확인하는 과정
		Course<Person> perCourse = new Course<Person>("일반인 과정",3);
		perCourse.add(new Person("일반인"));
		perCourse.add(new Person("러시아인"));
		perCourse.add(new Person("독일인"));
		registercourse(perCourse);
		
		Course<Worker> wCourse = new Course<>("직장인 과정",3);
		wCourse.add(new Worker("김대리"));
		wCourse.add(new Worker("박과장"));
		wCourse.add(new Worker("김차장"));
		registercourse(wCourse);
		
		//registercourse(wCourse);
		//registercourseStudent(wCourse);//문제발생
		//registercourseWorker(wCourse);
		
		Course<Student> sCourse = new Course<>("학생과정",3);
		sCourse.add(new Student("김창식"));
		sCourse.add(new Student("최창식"));
		sCourse.add(new Student("박창식"));
		registercourse(sCourse);
	
	}

}
