package prac2;

public class Doctor{
	
	private int age;
	private int career;
	private String hospitalName;
	
	public Doctor(int age, int career, String hospitalName) {
		super();
		this.age = age;
		this.career = career;
		this.hospitalName = hospitalName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	
//	@Override
//	public String toString() {
//	return "저는" + this.hospitalName + "에서 일하는 " + this.age + "살" + this.career+"경력의 의사입니다";
//	
//	}디형성에 의거하여 to string 을 	불러오기가 어렵다
	
	
	

}
