package example08;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> scores = new TreeMap<>();
		
		scores.put(87, "김길환");
		scores.put(98, "신은혁");
		scores.put(75, "손연재");
		scores.put(95, "김삼순");
		scores.put(80, "양길환");
		
		Map.Entry<Integer, String> entry = null;
		entry = scores.firstEntry();//접미사 엔트리가 붙음
		System.out.println("가장 낮은 점수 : "+entry.getKey() + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : "+entry.getKey()+ entry.getValue());
		
		entry = scores.lowerEntry(95);
		System.out.println("점수 : "+entry.getKey()+ entry.getValue());
		
		entry = scores.higherEntry(95);
		System.out.println("점수 : "+entry.getKey()+ entry.getValue());
		
		entry = scores.floorEntry(95);
		System.out.println("가장 높은 점수 : "+entry.getKey()+ entry.getValue());
		
		entry = scores.ceilingEntry(95);
		System.out.println("점수 : "+entry.getKey()+ entry.getValue());
//		
//		while(!scores.isEmpty()) {
//			entry = scores.pollFirstEntry();
//			int value = entry.getKey();
//			String str = entry.getValue();
//			System.out.println(value + " "+ str);
//			System.out.println(scores.size());
//		}

//		
//		while(!scores.isEmpty()) {
//			entry = scores.pollLastEntry();
//			int value = entry.getKey();
//			String str = entry.getValue();
//			System.out.println(value + " "+ str);
//			System.out.println(scores.size());
//		}
		
	Set<Map.Entry<Integer, String>> entryset =scores.entrySet();
	Iterator<Entry<Integer, String>> iterator = entryset.iterator();
	
	while(iterator.hasNext()) {
		Map.Entry<Integer, String> mapentry = iterator.next();
		String str = mapentry.getValue();
		int value = mapentry.getKey();
		System.out.println(str+value);
		
		//keyset() 를 이용해서 출력해보기
	}
	}

}
