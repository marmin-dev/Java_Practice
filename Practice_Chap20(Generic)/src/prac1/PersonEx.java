package prac1;

public class PersonEx {

	public static void main(String[] args) {
		Person<Integer> person = new Person<Integer>(300);
		int val1 = person.getT();
		System.out.println(val1);
		person.setT(650);
		val1=person.getT();
		System.out.println(val1);
		
		Person<Apple> apple = new Person<Apple>(null);
		apple.setT(new Apple());
		Apple a = apple.getT();
		System.out.println(a);
		

	}

}
