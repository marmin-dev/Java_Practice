package prac2;

public class PersonEx {

	public static void main(String[] args) {
		
		Person<Doctor, String> p1 = new Person<>();
		p1.setN(new Doctor(32, 14, "돌담병원"));
		p1.setJ("퇴근하고싶어요");
		String str = p1.getJ();
		String str1 = p1.toString();
		System.out.println(str1.toString()+str);

	}

}
