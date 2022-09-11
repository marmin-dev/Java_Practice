package sec01.example02;

@FunctionalInterface
public interface MyInterface {
	
	void method(int a);
	//추상메서드가 2개이상이 되면 컴파일 예외를 발생시킨다
}
