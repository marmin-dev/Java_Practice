package example03;

public class RandomEx {

	public static void main(String[] args) {
		//System.out.println(Math.random());
		//Math.random()값은 0.0000000~0.99999사이 값 리턴
		int num = (int)(Math.random()*45)+1;
		System.out.println(num);
		if(num==1) {
			System.out.println("1이 나왔네요!");
		}
		else if(num==2) {
			System.out.println("2가 나왔네요!");
		}
		else if(num==3) {
			System.out.println("2가 나왔네요!");
		}
		else if(num==4) {
			System.out.println("2가 나왔네요!");
		}
		else if(num==5) {
			System.out.println("2가 나왔네요!");
		}
		else {
			System.out.println("6이 노왔네요!");
		}
	}

}
