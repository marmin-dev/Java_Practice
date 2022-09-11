package example03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		//키가 String 이고 값이 Integer이다 두다 객체라는 것에 주목하자
		Map<String,Integer> map = new HashMap<>();
		System.out.println("사이즈 : " + map.size());
		
		map.put("신은혁", 95);
		map.put("김길환", 90);
		map.put("예비군", 85);
		map.put("김형택", 90);
		map.put("신은혁", 950);
		
		//저장은 신은혁 95가 먼저 저장이 됬지만, 중복된 키를 저장하지 않기때문에
		//신은혁 두번째 저장이 덮어쓰기가 되었다 마지막에 추가된 값으로 설정된다
		
		System.out.println("사이즈 : " + map.size());
		
		System.out.println("김길환 : "+map.get("김길환"));
		System.out.println("신은혁 : "+map.get("신은혁"));
		System.out.println("-------------------------");
		
		//map컬렉션에 있는 키값만 셋계열로 바꾼다
		Set<String> keySet = map.keySet();//키만 가져오는것
		System.out.println("keySet()으로 출력 ");
		//반복자얻기
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			int value = map.get(key);
			//반복자를 통해서 얻은 키값을 가지고 값을 얻어온다
			System.out.println(key);
			System.out.println(value);
		}
		
		System.out.println("-------------------------");
		
		//map컬렉션의 Map.Entry 객체를 대상으로 set계열로 바꾼다
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryent = entrySet.iterator();
		
		while(entryent.hasNext()) {
			Map.Entry<String, Integer> entry =entryent.next();
			String key = entry.getKey(); //키값을 얻는다
			int value = entry.getValue();//값을 얻는다
			System.out.println(key +" : "+value);
		}
		System.out.println("-------------------------");
		
		map.clear();
		System.out.println("총 mapEntry 수 : " + map.size());
	}

}
