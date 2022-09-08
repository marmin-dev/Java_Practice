package example02;

import java.util.HashSet;

public class PersonEx {

	public static void main(String[] args) {
		
		HashSet hashSet = new HashSet();
		//사용자 정의 클래스에서는
		//hash시리즈들은 반드시 hash코드와 이퀄즈를 오버라이딩을해야
		//중복저장이 안된다
		//String str1 = new String("가");
		//String str2 = new String("가");
		//스트링은 오버라이딩이 되어있어 같은 해시코드 리턴
		Person person1 = new Person("홍길동",50);
		Person person2 = new Person("홍길동",40);
		//퍼슨 클래스는 오버리이딩을 해놓지 않아서 다른 해시코드 리턴
		
		//hashSet.add(str1);
		//hashSet.add(str2);
		hashSet.add(person1);
		hashSet.add(person2);
		System.out.println(hashSet.size());
		
		//System.out.println(str1.hashCode());
		//System.out.println(str2.hashCode());
		
		System.out.println(person1.hashCode());//자동적 tostring 호출
		System.out.println(person2.hashCode());
		
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		
	}

}
