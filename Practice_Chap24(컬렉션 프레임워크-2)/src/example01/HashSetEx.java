package example01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		System.out.println("사이즈 : "+set.size());
		
		set.add("쫄깃쫄깃");
		set.add("탱글탱글");
		set.add("야들야들");
		set.add("지글지글");
		set.add("퉁퉁퉁퉁");
		set.add("쫄깃쫄깃");
		//null값도 set계열에 저장이 가능하지만 오로지 하나만 가능하다
		//set.add(null);
		System.out.println("사이즈 : "+set.size());
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();//객체가져와
			System.out.println(element);
			//반복자를 통해 가져오면 셋에서 객체들을  제거하지 않는다
			System.out.println("사이즈 : "+set.size());
		}
		System.out.println();
		set.remove("야들야들");
		set.remove("지글지글");
		System.out.println("사이즈 : "+set.size());
		
		for(String str : set) {
			System.out.println(str);
		}
		set.clear();
		System.out.println("사이즈 : "+set.size());
		if(set.isEmpty())
			System.out.println("가엾고 딱딱한자로다");
	}

}
