package example01;

public class VarEx02 {

	public static void main(String[] args) {
//메인 메서드 안의 범위이		
		int number;//넘버라는 변수만 스택에다 선언한것 4바이트 할당 
		number = 200;//초기화를 하고있다 
		int number2 = 500;//선언과 동시에 초기화 
		System.out.println(number);//지역변수 
		System.out.println(number2);
		
		
	String str = new String("붕어빵");
	System.out.println(str);
	str = null;
	//null 은 없다는 뜻을 의미한다.
	System.out.println(str);	
	//더이상 붕어빵을 가르키지않고 널 값을 지니게 된다.
	//키워드는 변수명으로 사용이 불가능하다 숫자가 먼저와도 안된다
	double dnum =10.01;
	//특수문자는 $와 _만 사용이 가능하다
	final int MAX = 100;
	//상수는 왠만하면 대문자로 써주자
	//MAX = 200; 즉 상수는 변하지 않는 값이기 때문에 
	//다시 그값에다가 상수값을 변경시키는 코드가 들어가면 안된다.
	System.out.println("상수" + MAX);
	System.out.println(number);
	System.out.println(number2);
	//변수 상수 리터럴 등 명확하게 구분하자.
	}

}
