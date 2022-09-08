package example07;

public class A {
	int a=0;
	int b=0;
	class B{
		public B()
		{
			
			System.out.println("Constructor of Class B");
		}
		private int age;
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
	}
	static class C {
		private static int old = 10;
		private int a =10;
		public C() {
			System.out.println("Constructor of Class C");
		}
		public static int getOld() {
			return old;
		}
		public static void setOld(int old) {
			C.old = old;
		}
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		
	}
	public void method() {
		
		class D{
			public D() {
				System.out.println("Constructor of Class D");
			}
			
		}
		D d =new D();
	}

}
