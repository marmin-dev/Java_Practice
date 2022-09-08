package example02prac;

import java.util.Objects;

public class Student {
	
	private int age;
	private String name;
	
	public Student(int age , String name) {
		this.age=age;
		this.name=name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
	System.out.println("hashcode");
	//return Objects.hash(this.age,this.name);
	return this.name.hashCode()+this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
	System.out.println();
	Student stu =(Student)obj; //obj down casting
	if(this.name.equals(stu.name)&&this.age==stu.age) {
		return true;
	}
	return false;
	}
	
}
