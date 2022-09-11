package example02;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx {

	public static void main(String[] args) {
		
		//new를 사용했기떄문에, 아래 4개의 멤버 객체는 서로 다른주소를 가지고있다
		//하지만 멤버클래스에서 해시코드를 재정의 했기에 동등객체로인식을 한다
		//하여 Set은 중복저장을 하지 않는다
		HashSet<Member> set = new HashSet<Member>();
		set.add(new Member("김길환", 30));
		set.add(new Member("김길환", 30));
		set.add(new Member("김길환", 20));
		set.add(new Member("김길환", 15));
		
		System.out.println("총객체수 : "+set.size());
		//반복자
		Iterator<Member> iterator = set.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			System.out.println(member.getName()+" : "+member.getAge());
		}
	}

}
