package example07;

public class AEX {

	public static void main(String[] args) {
		A a = new A();
		A.B b =a.new B();
		b.setAge(20);
		System.out.println(b.getAge());
		A.C.setOld(15);
		System.out.println(A.C.getOld());
		a.method();

	}

}
