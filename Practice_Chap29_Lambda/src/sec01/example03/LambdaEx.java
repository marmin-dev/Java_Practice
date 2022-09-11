package sec01.example03;

public class LambdaEx {

	public static void main(String[] args) {
		
		MyInterface myInterface = null;
		
		myInterface = (a,b) ->
			a+b;
		;
		
		int result = myInterface.method(200, 100);
		System.out.println(result);
		
		myInterface = (x,y) -> add(x,y);
		result = myInterface.method(300, 500);
		System.out.println(result);
		
	;
		
		
	}
	public static int add(int x, int y ) {
		return x+y;
	}
}
