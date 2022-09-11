package example08;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSortEx {

	public static void main(String[] args) {
		TreeMap<Integer,String> scores = new TreeMap<>();
		
		scores.put(87, "김길환");
		scores.put(98, "신은혁");
		scores.put(75, "손연재");
		scores.put(95, "김삼순");
		scores.put(80, "양길환");
		
		//정렬하기 key값으로 정렬이 되는것에 주목하장
		NavigableMap<Integer, String> navi = scores.descendingMap();
		//내림차순이 된 디센딩 맵을 출력하기 위해서 엔트리셋 메서드를통해서 셋으로 대입하고있다
		//출력을 하기 위해서
		Set<Map.Entry<Integer, String>>decending = navi.entrySet();
		//출력하기
		for(Map.Entry<Integer, String> entry: decending) {
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println(value+str);
		}
		System.out.println("-----------------");
		NavigableMap<Integer, String> accending= navi.descendingMap();
		Set<Map.Entry<Integer, String>> accend = accending.entrySet();
		for(Map.Entry<Integer, String> accen: accend) {
			int value = accen.getKey();
			String str = accen.getValue();
			System.out.println(value+str);
		}
		System.out.println("-----------------");
		//키만 가져와서 반복자로해봄
		NavigableSet<Integer> navia = scores.descendingKeySet();
		Iterator<Integer> iterator = navia.iterator();
		while(iterator.hasNext()) {
			int val1 = iterator.next();
			String val2 = scores.get(val1);
			System.out.println(val1);
			System.out.println(val2);
		}
		
	}

}
