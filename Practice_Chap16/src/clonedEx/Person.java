package clonedEx;

import java.util.Arrays;
import java.util.Objects;

public class Person implements Cloneable{
	private String name;
	private int age;
	private String job;
	private String[] family = null;
	
	public Person(String name, int age, String job, String[] family) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.family = family;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getJob() {
		return job;
	}
	public String[] getFamily() {
		return family;
	}
	public Person getPerson() {
		Person cloned = null;
		try {
			cloned =(Person)this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
	@Override
	public String toString() {
		return this.getName() + this.getAge()+ this.getJob()+Arrays.toString(family);
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.name,this.age,this.job,this.family);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person person = (Person)obj;
			if(this.name.equals(person.name)&&this.age==person.age&&this.job.equals(person.job)&Arrays.equals(this.family, person.family)) {
				return true;
			}
		}
		return false;
	}

}
