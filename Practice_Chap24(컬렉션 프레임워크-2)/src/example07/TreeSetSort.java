package example07;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetSort {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(100);
		scores.add(-50);
		//기본적으로 오름차순 정렬이 이루어진다
		System.out.println(scores);
		System.out.println("객체수 : "+scores.size());
		
		//다시 올림차순으로 바뀐다
		NavigableSet<Integer> de =scores.descendingSet();		
		System.out.println(de);
		NavigableSet<Integer> accendingset =de.descendingSet();
		System.out.println(accendingset);
	}

}
