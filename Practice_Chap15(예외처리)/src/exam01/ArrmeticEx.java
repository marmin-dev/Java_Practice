package exam01;

public class ArrmeticEx {

	public static void main(String[] args) {
		//산술적 예외가 발생
		int a = 10;
		int b =0;
		int c = a/b;
		System.out.println(c);
//모든 수는 0으로 나눌수가 없다 (산술적문제)
		//runtime exception을 상속받기 때문에 실행 예외가 된다
	}

}
