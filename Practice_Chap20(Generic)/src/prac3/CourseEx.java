package prac3;

import java.util.Arrays;

public class CourseEx {
	
	public static void resistercourse(Course<?> course) {
		System.out.println(course.getName()+"수강생"+ Arrays.toString(course.getStudent()));
	}
	
	

	public static void main(String[] args) {
		Course<Person> pCourse = new Course<>("일반인", 3);
		pCourse.add(new Person("박창식"));
		pCourse.add(new Person("김창식"));
		pCourse.add(new Person("김계란"));
		resistercourse(pCourse);
	}

}
