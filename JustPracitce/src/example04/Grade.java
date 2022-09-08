package example04;

public class Grade {
	private int math;
	private int science;
	private int english;
	public Grade(int math, int science, int english) {
		super();
		this.math = math;
		this.science = science;
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public int getScience() {
		return science;
	}
	public int getEnglish() {
		return english;
	}
	
	public int avgCal() {
		int avg=0;
		avg = (int)(getMath()+getScience()+getEnglish())/3;
		return avg;
	}

}
