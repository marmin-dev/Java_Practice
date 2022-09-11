package example04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylistLinkedlistEx {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		LinkedList<String> linkedList = new LinkedList<>();
		
		System.out.println("===순차적으로 데이터 추가하기===");
		System.out.println("ArrayList : "+add1(arrayList));
		System.out.println("LinkedList : "+add1(linkedList));
		
		System.out.println("===비순차적으로 데이터 추가하기===");
		System.out.println("ArrayList : "+add2(arrayList));//배열복사 발생
		System.out.println("LinkedList : "+add2(linkedList));//노드값변경
//		
//		System.out.println("===순차적으로 데이터 삭제하기===");
//		System.out.println("ArrayList : "+remove1(arrayList));
//		System.out.println("LinkedList : "+remove1(linkedList));
		
		System.out.println("===비순차적으로 데이터 삭제하기===");
		System.out.println("ArrayList : "+remove2(arrayList));
		System.out.println("LinkedList : "+remove2(linkedList));
		
		//순차는 어레이 리스트 비순차적은 링크드 리스트
		
		
	}
	
	//순차적 데이터추가
	public static long add1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<200000;i++) {
			list.add(i+"");
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}
	
	
	//비순차적 데이터 추가
	public static long add2(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<200000;i++) {
			list.add(500,"X");
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}
	
	//순차적 데이터 삭제
	public static long remove1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=list.size()-1; i>=0;i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return (end - start);
	}
	
	//순차적 데이터 삭제
		public static long remove2(List<String> list) {
			long start = System.currentTimeMillis();
			for(int i=0; i<list.size();i++) {
				list.remove(i);
			}
			long end = System.currentTimeMillis();
			return (end - start);
		}
	
}
