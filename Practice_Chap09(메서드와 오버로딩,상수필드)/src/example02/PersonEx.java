package example02;

public class PersonEx {

	public static void main(String[] args) {
		
		Person p1 = new Person(50);
		Person p2 = new Person(150);
		Person p3 = new Person(30);
		//final 속성은 상수이므로 값을 변경할수없다.
		//p.nation = "USA";
		//p.age = 100;
		//공용데이터로 많이 사용된다.함부로 변경했다 디진다..
		System.out.println(p1.age);
		System.out.println(p2.age);
		System.out.println(p3.age);
		System.out.println(Person.MAX_NUMBER); //붕어빵으로 호출 x
		
		
		
		
	}

}
