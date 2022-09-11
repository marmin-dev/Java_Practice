package example07;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetSearchEx {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();
		//알파벳의 유니코드에 따라 이진트리에 각각 좌측부터 저장된다
		treeSet.add("apple");
		treeSet.add("f");
		treeSet.add("fever");
		treeSet.add("decription");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("guess");
		treeSet.add("cherry");
		System.out.println(treeSet);
		
		treeSet.add("가라");
		treeSet.add("레인지");
		treeSet.add("로버");
		treeSet.add("재규어");
		treeSet.add("람보르기니");
		treeSet.add("페라리");
		treeSet.add("김길환");
		
		//여기서 헷갈릴수가있는 c~f사이라는 것은 시작이 c부터 f한자까지만 검색을
		//해주지만 f포함 두자 이상은 검색하지않는다
		System.out.println("[c~f]사이의 단어를 검색해보기");
		NavigableSet<String> rangeSet = treeSet.subSet("가", false , "파" , true);
		System.out.println(rangeSet);
	}

}
