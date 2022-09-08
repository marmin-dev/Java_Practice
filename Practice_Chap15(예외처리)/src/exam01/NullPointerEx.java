package exam01;

public class NullPointerEx {

	public static void main(String[] args) {
		String str = null;
		//이 예외는 객체가 없는데 어떻게 tostring을 호출하겠니..?
		try {
		System.out.println(str.toString());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
