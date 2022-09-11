package sec01.example02;

public class LambdaEx {

	public static void main(String[] args) {
		
		MyInterface myInterface = null;
		
		myInterface = (x) ->{
			int result = x+10;
			System.out.println(result);
		};
		//여기서 100은 매개변수이다, 하여 람다식의 매개변수인 x에 대입되어진다
		myInterface.method(100);
		
		MyInterface my = x->{
			int result = x+10;
			System.out.println(result);
		};
		my.method(2000);
		
		
	}
}
