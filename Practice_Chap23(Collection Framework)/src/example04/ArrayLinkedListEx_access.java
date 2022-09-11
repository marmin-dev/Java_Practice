package example04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.sound.midi.SysexMessage;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class ArrayLinkedListEx_access {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		LinkedList<String> linkedList = new LinkedList<>();
		
		add(arrayList);
		add(linkedList);
		
		System.out.println("==접근시간테스트==");
		System.out.println("ArrayList : "+ access(arrayList));
		System.out.println("LinkedList : "+ access(linkedList));
	}//결론 지금까지 살펴본 예제들을 보면 역시 순차적 추가 접근은 어레이 리스트가 성능이 우수한 반면에
	//중간에 삽입,삭제는 linkedlist가 확연하게 빠르다는 것을 알수가 있다
	public static void add(List<String> list) {
		for(int i=0;i<100000;i++) {
			list.add(i+"");
		}
	}
	public static long access(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			list.get(i);
		}
		long end =System.currentTimeMillis();
		return end - start;
	}
}
