package example09;


public class Person implements Comparable<Person>{

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

//	@Override
//	public int compareTo(Person o) {
//		if(this.age<o.age) {
//			return -1;	
//		}
//		else if(this.age==o.age) {
//		return 0;
//		}
//		else
//			return 1;
//	}
	@Override
	public String toString() {
		return this.name + " "+ this.age;
	
	}
//	@Override
//	public int compareTo(Person o) {
//		return this.age-o.age;
//	}
	
	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name) - o.name.compareTo(this.name);
	}
}
