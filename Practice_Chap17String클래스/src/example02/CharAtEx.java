package example02;

public class CharAtEx {

	public static void main(String[] args) {
		
		String ssn = "980203-245687";
		//Ư�����ڸ� �ް��� �Ҷ� ����ϴ� �޼���
		char sex = ssn.charAt(7);
		
		if(sex == '1'||sex=='3') {
			System.out.println("�����Դϴ�");
		}
		else if(sex == '2'||sex=='4') {
			System.out.println("�����Դϴ�");
		}
		else {
			System.out.println("�����̷��� ����� �ƴ϶��մϴ�");
		}
	}

}
