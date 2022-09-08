package example03;

public class StringArrayEx {

	public static void main(String[] args) {
		//String 배열 
//		String str = new String("자바");
//		System.out.println(str);

		String[] str = new String[] {
							"안녕" , "홍길동","김연아"
								};
		//객체 (클래스)배열
		//string 은 2차원 배열의 형태를 지니고있다.
		//객체(클래스)배열은 전부 2차원 형태로 되어있다.
		for(int i= 0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		str[0]="가자";
		//향상된 for 문
		for(String str1 : str) {
			System.out.println(str1);
			//향상된 for문 역시 익숙해져야한다.
		}
		System.out.println("string 배열의 주소" + str);
		//Object클래스는 모든 클래스의 최고조상이다.
		//String class는 Object class의 오버라이딩을 재정의
		System.out.println("string 배열의 주소" + str[0]);
		//재정의 했기때문에 .tostring()을 하지않아도 값이나온다.
	}

}
