package example10;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorEx {

	public static void main(String[] args) {
		//생성자에 비교기준을 이미 제시한것
		//TreeSet<Fruit> treeSet = new TreeSet<>(new AccendingComparator());
		TreeSet<Fruit> treeSet = new TreeSet<>(new Comparator<Fruit>() {

			@Override
			public int compare(Fruit o1, Fruit o2) {
				return o1.getPrice() - o2.getPrice();
			}
		});
		
			
		
		try {
		treeSet.add(new Fruit("딸기", 4200));
		treeSet.add(new Fruit("포도", 6500));
		treeSet.add(new Fruit("바나나", 3200));
		treeSet.add(new Fruit("복숭아", 8200));
		treeSet.add(new Fruit("용과", 4100));
		treeSet.add(new Fruit("두리안", 9100));
		}catch(Exception e) {
			System.out.println("줏대없네");
			e.printStackTrace();
		}
		System.out.println("총 객체수" + treeSet.size());
		
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.getName());
			System.out.println(fruit.getPrice());
		}
		//Collections.sort(); list계열만 사용
		
		
		
	}
	

}
