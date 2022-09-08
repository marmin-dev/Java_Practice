package pro2;

public class adress {
	
	private String adressnum;
	
	private String telnum;
	
	private String roadnum;

	public adress(String adressnum, String telnum, String roadnum) {
		this.adressnum = adressnum;
		this.telnum = telnum;
		this.roadnum = roadnum;
	}

	public String getAdressnum() {
		return adressnum;
	}

	public String getTelnum() {
		return telnum;
	}

	public String getRoadnum() {
		return roadnum;
	}
	
	@Override
	public String toString() {
		return getAdressnum() +" " + getTelnum() +" "+ getRoadnum();
	}
	
	
	
	
}
