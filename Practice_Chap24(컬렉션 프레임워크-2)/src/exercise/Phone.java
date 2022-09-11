package exercise;

public class Phone {

	private String name;//이름
	
	private String adress;//주소
	
	private String telnum;//전화번호
	
	public Phone(String name, String adress, String telnum) {
		this.name = name;
		this.adress = adress;
		this.telnum = telnum;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public String getTelnum() {
		return telnum;
	}
	
	@Override
	public String toString() {
		return "이름 : " + this.name + "\n주소"+this.adress+"\n전화번호"+
	this.telnum;
	
	}
	
	
	
	
}
