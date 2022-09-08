package example05;

public class MemberEx {
	//제네릭 클래스인 멤버를 리턴함 멤버 엑스클래스의 인스턴스 메서드
	public <T> Member<T> boxing(T t) {
		Member<T> member = new Member<T>();
		member.setT(t);
		return member;
	}
	public static <T> Member<T> box(T t) {
		Member<T> member = new Member<T>();
		member.setT(t);
		return member;
	}
	
	

	public static void main(String[] args) {
		
		MemberEx memberEx = new MemberEx();
		Member<Integer> member = memberEx.boxing(new Integer(100));
		System.out.println("Member 클래스의 값 : "+member.getT());
		
		 Member<String> member2 = box("홍길동");
		 System.out.println(member2.getT());
	}

}
