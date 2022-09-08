package example04;

public class PersonEx {

	public static void main(String[] args) {
		
		Person<Integer> p1 = Util.changing(new Integer(100));
		int value = p1.getT();
		System.out.println("Person객체가 가지고 있는 값 : "+value);
		
		Person<String> p2 = Util.changing("홍길동");
		String value1 = p2.getT();
		System.out.println(value1);
	}

}
