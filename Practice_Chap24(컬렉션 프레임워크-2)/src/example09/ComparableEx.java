package example09;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class ComparableEx {

	public static void main(String[] args) {
		
		TreeSet<Person> treeset = new TreeSet<>();
		//사용자 정의 클래스를 트리셋에 저장을 하기위해선
		//컴패러블을 오버라이딩해서 추가하자
		treeset.add(new Person("martin", 22));
		treeset.add(new Person("ave", 65));
		treeset.add(new Person("eve", 35));
		treeset.add(new Person("son", 34));
		treeset.add(new Person("homer", 32));
		treeset.add(new Person("margaret", 62));
		treeset.add(new Person("maverick", 43));
		treeset.add(new Person("docker", 33));
		treeset.add(new Person("jackson", 61));
		
		System.out.println("총 객체 : " + treeset.size());
		
		Iterator<Person> iterator =treeset.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.toString());
		}
		
		System.out.println("====================");
		System.out.println();
		
		NavigableSet<Person> navi = treeset.descendingSet();
		Iterator<Person> iterator2 = navi.iterator();
		while(iterator2.hasNext()) {
			Person person = iterator2.next();
			System.out.println(person.toString());
		}
		
	}

}
