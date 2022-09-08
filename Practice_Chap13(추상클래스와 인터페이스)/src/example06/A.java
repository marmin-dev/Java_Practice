package example06;

public class A {
	//B클래스 만들어져야지만 컴파일  예외가 사라진다.
	//B클래스가 A클래스에게 직접적인 영향을 미친다
	//사용하는측
public void methodB(I i) {
	i.method();
}
public void methodC(I i) {
	i.method();
}
}
