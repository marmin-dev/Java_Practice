package example07;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		//TreeSet은 이진트리 기반으로 이루어진 컬렉션이며, Set인터페이스와 SortedSet인터페이스
		//를 구현한 클래스이다
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		//객체 추가
		scores.add(87); //자동박싱
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		
		System.out.println(scores.size());
		
		//가장 낮은 점수를 구해보기(이진트리의 가장 왼쪽의 값)
		System.out.println("가장 낮은 점수 : "+scores.first());
		
		//가장 높은 점수를 구해보기(이진트리의 가장 우측의 값)
		System.out.println("가장 높은 점수 : "+scores.last());
		
		//주어진 객체의 왼쪽에 있는 점수--주어진 객체는 포함하지 않는다.
		System.out.println("가장 높은 점수 : "+scores.lower(80));
		
		//주어진 객체의 우측에 있는 점수--주어진 객체는 포함하지 않는다.
		System.out.println("가장 높은 점수 : "+scores.higher(80));
		
		//주어진 객체의 왼쪽에 있는 점수--주어진 객체포함.
		System.out.println(scores.floor(80));
		
		//주어진 객체의 우측에 있는 점수--주어진 객체포함.
		System.out.println(scores.ceiling(80));
		
//		while(!scores.isEmpty()) {
//			score = scores.pollFirst(); //맨 왼쪽 객체부터 가져옴,가져온뒤 트리셋에서 제거
//			System.out.println(scores.size());
//			System.out.println(score);
//		}
//		while(!scores.isEmpty()) {
//			score = scores.pollLast(); //맨 왼쪽 객체부터 가져옴,가져온뒤 트리셋에서 제거
//			System.out.println(scores.size());
//			System.out.println(score);
//		}
		//pollfirst 와 pollLast와 반복자의 가장큰차이점은 객체를 제거하느냐에 대한
		//차이점에 있다
		//반복자에서는 명시적으로 리무브를 표시해야 된다
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			int value = iterator.next();
			iterator.remove();
			System.out.println(value + "남은 객체수"+scores.size());
		}
		
	}

}
