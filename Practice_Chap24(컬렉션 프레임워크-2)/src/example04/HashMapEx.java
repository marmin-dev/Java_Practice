package example04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<Student,Integer> map = new HashMap<>();
		//키	객체가 동등객체라면 증복 저장하지 않는다.
		map.put(new Student(1001, "김길환"), 95);
		map.put(new Student(2001, "이민환"), 90);
		map.put(new Student(1001, "김길환"), 100);
		map.put(new Student(3001, "러시아"), 75);
		
		System.out.println("총 entry수" + map.size());
		//중복저장은 하지 않는데 뒤에 들어온 내용으로 덮어쓰기한다
		//뒤에 저장된것으로 덮어써진다
		System.out.println("김길환"+map.get(new Student(1, "김길환")));
		
		Set<Student> keySet = map.keySet();
		Iterator<Student> keyiterator = keySet.iterator();
		while(keyiterator.hasNext()) {
			Student key = keyiterator.next();
			System.out.println("이건 학생이야 : "+key.getSno()+"  "+key.getName()+
				"점수"+map.get(new Student(key.getSno(),key.getName())));
		}
		
		
		
	}

}
