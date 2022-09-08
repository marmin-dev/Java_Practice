package arraysEx;

import java.util.Arrays;
//사용자 정의 클래스는 정렬을 하기 위해서는 Comparable 인터페이스를 구현해야한다
class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		//return o.name.compareTo(this.name);
		return o.age - this.age;
	}
}
public class ArraySortEx {

	public static void main(String[] args) {
		Person person1 = new Person("홍길동",29);
		Person person2 = new Person("김길동",39);
		Person person3 = new Person("서길동",49);
		Person person4 = new Person("주길동",19);
		Person person5 = new Person("고길동",9);
		
		Person[] persons = {person1,person2,person3,person4,person5};
		Arrays.sort(persons);
		System.out.println(Arrays.toString(persons));
		for(Person person : persons) {
			System.out.println("이름 : "+person.name + "나이"+person.age);
		}
		//배열검색(binarySearch는 반드시 sort하고 난뒤에 해야한다
		int index = Arrays.binarySearch(persons, person2);
		System.out.println("person2인스턴스가 있는 인덱스" + index + "이름" 
		+ persons[index].name);
		
		//기본형 타입과 스트링클래스는 어레이즈 소트를 하면 오름차순 정렬이 이루어진다
		int[] arr = {55,-10,-9,0,100};
		Arrays.sort(arr);
		System.out.println("디폴트값 솔팅" + Arrays.toString(arr));
		//오름차순으로 자동으로 정렬이 되었다
		
		String[] names = new String []{ "김길환","이종범","홍길동","이주민"};
		Arrays.sort(names);
		System.out.println("스트링타입 솔팅" + Arrays.toString(names));
		//사전순으로 오름차순 정렬이 된다 디폴트값
		

	}

}
