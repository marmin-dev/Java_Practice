package example02;

public class PersonEx {

	public static void main(String[] args) {
		
		//JDK1.7부터는 앞에다만 제네릭 타입을 지정해주면 된다 뒤는 유추
		//Person 제네릭 클래스에 T를 String 만 들어오게끔 만들었다
		Person<String> person = new Person<>();
		person.setT("김길환"); 
		String str = person.getT();
		System.out.println(str);
		
		//현업에서는 데이터의 통일화를 가져오고 타입변횐제거 컴파일시에 
		//체크드 익셉션을 발생시킨다
		Person<Integer> person1 = new Person<>();
		person1.setT(2316); 
		int val = person1.getT();//자동언박싱코드
		System.out.println(val);
		
		Person<Apple> person3 = new Person<>();
		person3.setT(new Apple()); 
		Apple a = person3.getT();
		System.out.println(a);
	}

}
