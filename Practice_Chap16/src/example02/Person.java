package example02;

import java.util.Objects;

public class Person {

	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashcode()");
		//return this.name.hashCode() + this.age;
		return Objects.hash(this.name,this.age);
		//jdk1.7부터 나온거라 구형은 전자로하자
	}
	//hash 시리즈들은 동등객체를판단하기 위해서 1차적으로 해시코드 호출
	//2차적으로 값이 또 같은 이퀄즈를 호출
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if(obj instanceof Person) {
			Person person = (Person)obj;
			if((this.name.equals(person.name)&&this.age==(person.age))){
					return true;
			}
		}
		return false;
	}
	//객체의 주소보다 좀더 의미있는 데이터를 출력하도록 오버라이딩
@Override
public String toString() {
	return "이름 : " + this.getName() +this.getAge();
}
	
}
