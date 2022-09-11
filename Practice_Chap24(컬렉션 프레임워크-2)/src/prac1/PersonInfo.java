package prac1;

public class PersonInfo implements Comparable<PersonInfo>{

	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public PersonInfo(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(PersonInfo o) {
		return this.name.compareTo(o.name) - o.name.compareTo(this.name);
	}
	@Override
	public String toString() {
		return getName() + " : " + getAge();
	
	}
	
}
