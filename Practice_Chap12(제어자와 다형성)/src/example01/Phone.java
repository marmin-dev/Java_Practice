package example01;

public class Phone {
//필드(멤버변수), 외부로 부터 접근 못하게 막는다.
	protected String model;
	//같은 패키지내에선 다 접근이 가능하다.protected
	//default역시 다른패키지에서 접근이 불가능하다.
	//다른 패키지에선 상속을 받더라도 접근이 불가능하다.
	
	protected String color;
	protected String company;
	
	
	//매개변수가 있는 생성
	public Phone(String model, String color, String company) {
		super();
		this.model = model;
		this.color = color;
		this.company = company;
	}
//getter()제공
	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public String getCompany() {
		return company;
	}
	@Override
		public String toString() {
		String str = "모델 : " + this.getModel() + ", 색상" + this.getColor() +
				", 제조회사 : " + this.getCompany();
		return str;	
		}
	
	
}
