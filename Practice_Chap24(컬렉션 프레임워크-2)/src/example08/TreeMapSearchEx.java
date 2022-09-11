package example08;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSearchEx {

	public static void main(String[] args) {
		TreeMap<String, Integer> treemap = new TreeMap<String, Integer>();
		//객체추가
		treemap.put("apple", 10);
		treemap.put("forever", 60);
		treemap.put("f", 64);
		treemap.put("descriptin", 40);
		treemap.put("ever", 50);
		treemap.put("zoo", 120);
		treemap.put("guess", 80);
		treemap.put("banana", 90);
		treemap.put("kdb", 80);
		treemap.put("cherry", 15);
		
		
		//c부터 f까지만 검색하기 ,f이후에 값이 있는 검색만 된다
		System.out.println("[c~f]사이 단어 검색하기");
		NavigableMap<String, Integer> rangemap = treemap.subMap("c",true, "f",true);
		Set<Map.Entry<String, Integer>> entryset = rangemap.entrySet();
		for(Map.Entry<String, Integer> entry:entryset) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("단어 : " + str + "페이지 넘버 : "+ value);
		}
		System.out.println("========================");
		System.out.println();
		for(Map.Entry<String, Integer> entryset12: treemap.entrySet()) {
			String str1=entryset12.getKey();
			int val1 = entryset12.getValue();
			System.out.println(str1 + " "+ val1);
		}
		System.out.println("========================");
		//"k"를 포함하고 이후 값들만 가지는 Map,Entry 객체를 얻어내기
		System.out.println("[k]부터 끝 단어 검색하기");
		NavigableMap<String, Integer> tailmap = treemap.tailMap("k",true);
		for(Map.Entry<String, Integer> entry1:tailmap.entrySet()) {
			String str = entry1.getKey();
			int value = entry1.getValue();
			System.out.println("단어 : " + str + "페이지 넘버 : "+ value);
		}
		System.out.println("========================");
		System.out.println();
		System.out.println("[k]부터 앞 단어 검색하기");
		NavigableMap<String, Integer> headmap = treemap.headMap("k",true);
		for(Map.Entry<String, Integer> entry1:headmap.entrySet()) {
			String str = entry1.getKey();
			int value = entry1.getValue();
			System.out.println("단어 : " + str + "페이지 넘버 : "+ value);
		}
		

	}

}
