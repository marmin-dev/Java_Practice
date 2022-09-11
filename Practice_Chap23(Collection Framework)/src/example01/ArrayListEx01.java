package example01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {
		
		//ArrayList는 제네릭타입이다 그래서 Warning이 뜬다
		//히여 없애고싶다묜우측상단의 퀵억세스에서 에러를 입력하고
		//프리퍼런스에 가서 제네릭스 탭에 있는것을 모두 이그노어로바꾸면 된다
		
		ArrayList list = new ArrayList();//기본적으로 10개의방을 생성함
		System.out.println("총크기 : "+list.size());//저장된 객체가 하나도 없기때문에 0을리턴
		//객체추가하기
		list.add("111");//boolean타입의 add Object타입의 o->순차적추가
		list.add("222");
		list.add("333");
		list.add("222");
		
		
		list.add(333);
		System.out.println("총크기 : "+list.size());
		System.out.println("Arraylist의 주소 : "+list.hashCode());
		System.out.println("ArrayList에 있는 값 : "+list.toString());
		
		//0번째 인덱스에 333추가하기
		list.add(0,"333");//list.add(new Integer(333));과 같다
		
		//객체 삭제하기
		list.remove("333");//객체를 삭제할때 동일한 객체가 있다면 앞에서부터
		//삭제한다 앞에서 부터 검색을 하기때문이다
		System.out.println("ArrayList에 있는 값 : "+list.toString());
		System.out.println("Arraylist의 주소 : "+list.hashCode());
		
		System.out.println(list.remove("333"));
		System.out.println("ArrayList에 있는 값 : "+list.toString());
		//저장된 객체의 인덱스를 찾아오기 없으면 -1을 리턴한다
		System.out.println("index : " + list.indexOf(333));
		
		//객체 전부 삭제하기
		//list.clear();
		//아래와 같이 삭제하면 객체가 남는다 남는이유는?
		//인덱스 0을 삭제할때 i가 0이니까 당연히 0인덱스에 있는 객체는 삭제되지만 
		//이후에는 i값이 증가되면서 해당인덱스를 삭제하지 못한다
		//항상뒤에서 부터 삭제를 해주는것이 좋다
//		for(int i =0; i<list.size();i++) {
//			list.remove(i);
//			System.out.println("ArrayList에 있는 값 : "+list.toString());
//		}
		//size 값은 4이고 인덱스는 0부터 시작이니 1을 뺴줘
		for(int i =list.size()-1; i>=0;i--) {
			list.remove(i);
			System.out.println("ArrayList에 있는 값 : "+list.toString());
		}
		
		
		System.out.println("ArrayList에 있는 값 : "+list.toString());
		
		
	}

}
