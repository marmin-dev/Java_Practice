package example02;

public class TryCatchEx {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			//System.out.println(2/0);//ArimethicsException발생
			System.out.println(5);//출력이 되지않는다
		}catch (Exception e) {
			System.out.println(6);
		}
		System.out.println(7);
	}

}
