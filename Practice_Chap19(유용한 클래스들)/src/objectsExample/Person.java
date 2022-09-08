package objectsExample;

import java.util.Arrays;
import java.util.Objects;

public class Person {
	
	int age;
	String name;
	int[] arr;
	
	public Person(int age, String name, int[] arr) {
		super();
		this.age = age;
		this.name = name;
		this.arr = arr;
	}
	
	@Override
	public int hashCode() {
		//return this.age + this.name.hashCode()+Arrays.toString(this.arr).hashCode();
		//멤버가 많으면 많을수록 코드가 길어진다
		//하위호환시엔 아래와 같이 작성을 하면 된다
		//신규 개발할때 아래와 같이 작성을 하면 해쉬코드를 얻기가 상당히 수월하다(신버전)
		return Objects.hash(this.age,this.name,Arrays.toString(arr));
	}
	
	
}
