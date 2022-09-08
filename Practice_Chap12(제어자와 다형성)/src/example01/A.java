package example01;

public class A  {

	Phone phone = new Phone("aa","yellow","LG");
	
//	public A(String model, String color, String company) {
//		super("aa", "yellow ","LG");
//	}
	public void method() {
		System.out.println(phone.model);
		System.out.println(phone.getCompany());
		System.out.println(phone.getColor());
	}

	
	
	
}
