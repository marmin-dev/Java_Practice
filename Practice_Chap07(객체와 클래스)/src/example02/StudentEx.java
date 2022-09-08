package example02;

public class StudentEx {

	
	public static void main(String[] args) {
		
		//아래는 각각 독립된 저장공간을 가지는 인스턴스가 힙에 할당이 된다.
		Student s1=new Student();
		Student s2=new Student();
		
		s1.age=42;
		s1.name ="홍길동";
		//s1의 주소를 s2 에다가 대입.
		s2=s1;
		s2.age=11;
		
		System.out.println(s1);
		System.out.println(s2);
		
		
	}

}
