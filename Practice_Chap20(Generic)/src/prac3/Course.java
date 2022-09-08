package prac3;

public class Course<T> {
	private String name;
	private T[] student;
	@SuppressWarnings("unchecked")
	public Course(String name,int size) {
		super();
		this.name = name;
		this.student=(T[])new Object[size];
	}
	public void add(T t) {
		for(int i=0;i<student.length;i++) {
			if(student[i]==null) {
				student[i]=t;
				break;
			}
			
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T[] getStudent() {
		return student;
	}
	public void setStudent(T[] student) {
		this.student = student;
	}

	
}
