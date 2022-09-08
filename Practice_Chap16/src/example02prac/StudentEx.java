package example02prac;

import java.util.HashSet;

public class StudentEx {

	public static void main(String[] args) {
		HashSet hashset =new HashSet();
		Student stu1 =new Student(15, "martin");
		Student stu2 =new Student(15,"martin");
		hashset.add(stu1);
		hashset.add(stu2);
		System.out.println(hashset.size());
	}

}
