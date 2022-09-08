package example02;

public class IndexOfEx {

	public static void main(String[] args) {
		
		//indexOf메서드는 찾기 기능을 할때, 자주 쓰인다(문서등)
		String str = "오늘은 자바가 하고 싶은 날이네요";
		int index =str.indexOf("자바");
		System.out.println(index);
		//자바라는 문자열이 포함되어 있으면..
		if(str.indexOf("자바")!=-1) {
			System.out.println("자바와 관련된 내용이군");
		}
		else {
			System.out.println("자바가 하고싶지 않군");
		}

	}

}
