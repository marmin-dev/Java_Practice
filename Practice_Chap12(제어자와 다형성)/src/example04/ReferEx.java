package example04;

public class ReferEx {

	public static void main(String[] args) {
		Parent parent = new Child();
		Child child = new Child();
		System.out.println(parent.x);
		System.out.println(child.x);
		parent.method();
		child.method(); // 오버라이딩된 메서드가 호출이 된다. 근본에 관계없이.
		//멤버변수는 근본을 벗어나지 못한다.
		
		parent.type(new Child());
		//서로 상속관계가 아니라면 바꿀수가 없다.

	}

}
