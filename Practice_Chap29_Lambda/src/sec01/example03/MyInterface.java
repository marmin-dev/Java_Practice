package sec01.example03;

@FunctionalInterface
public interface MyInterface {
	
	int method(int a , int b);
	//추상메서드가 2개이상이 되면 컴파일 예외를 발생시킨다
}
