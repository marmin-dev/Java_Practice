package sec02.example04;

public class Student {

	private String name;
	private String adress;
	private int englishScore;
	private int mathScore;
	
	public Student(String name,String adress, int englishScore, int mathScore) {
		this.name = name;
		this.adress = adress;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public String getAdress() {
		return adress;
	}
	
	public int getEnglishScore() {
		return englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}
	
	
	
}
