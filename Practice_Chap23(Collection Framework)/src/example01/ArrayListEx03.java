package example01;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx03 {

	public static void main(String[] args) {
		
		//Arrays.asList()는 컬렉션이 아니라,배열형식으로 된 컬렉션을 리턴한다
		List<String> list1 = Arrays.asList("홍길동","김길환","신은혁");
		//컬렉션은 컬렉션인데 배열이다 곧 정적이다
		//아래와 같이 객체 추가, 삭제를 하면 연산 오류가 난다
		//list1.add("개그맨");
		//list1.remove(0);
		System.out.println(list1.toString());
		
		List<Integer> list2 =Arrays.asList(100,200,300);
		
		Integer[] arr = (Integer[])list2.toArray();
		int[] arr1 = new int[3];
		
		//배열생성!컬렉션이 아닌 리스트컬렉션을 가지고 배열을 직접 만들고있다
		for(int i=0;i<arr.length;i++) {
			if(arr[0] ==100) {
				arr[0]=0;//바꿀수는 있다
			}
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr1[i];//언박싱
			}
		
				
		System.out.println(arr1.toString());
	}

}
