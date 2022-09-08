package example06;

public class indirectEx {
public static void main(String[] args) {
	I i = new B();
	i.method();
	System.out.println();
	A a = new A();
	a.methodB(i);
	a.methodC(i);
}
}
