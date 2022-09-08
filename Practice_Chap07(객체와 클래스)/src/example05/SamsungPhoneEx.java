package example05;

public class SamsungPhoneEx {

	public static void main(String[] args) {
		
		SamsungPhone sam = new SamsungPhone();
		sam.setCompany("삼성");
		sam.setModel("갤럭시 s8+");
		sam.setColor("블랙");
		sam.setRelease(2018);
		System.out.println(sam.toString());
	

	}

}
