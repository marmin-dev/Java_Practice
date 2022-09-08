package example06;

public class StudentAnnonymous {

	//필드의 초기값
	Student student1 = new Student("홍길동") {
		//익명자손객체의 멤버메서드
		public void goSchool() {
			System.out.println(this.name+"이 등교합니다");
		}
		
		@Override
		public void wake() {
			System.out.println("---------------");
			System.out.println("필드의 초기값형태로 만들어진 익명자손객체");
			System.out.println(this.name+"일어납니다");
			this.goSchool();
			System.out.println("----------------");
		}
		
	};
	public void method1() {
		Student lStudent = new Student("김연아") {
			
			public void goSkate() {
				System.out.println(this.name +"가 연습하러 스케이트 장에갑니다");
			}
			@Override
			public void wake() {
				System.out.println("---------------");
				System.out.println("필드의 초기값형태로 만들어진 익명자손객체");
				System.out.println(this.name+"일어납니다");
				this.goSkate();
				System.out.println("----------------");
				}
		};
		lStudent.wake();
	}	
	//메서드의 매개변수 값
	public void method2(Student student) {
		student.wake();
	}
}
