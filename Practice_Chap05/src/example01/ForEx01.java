package example01;

public class ForEx01 {

	public static void main(String[] args) {
		
		
		int sum = 0;
		//1~100까지 합을 구하는 반복문
		//int i=1 초기화코드 최초 한번만 실
		//싱글루프 일때...
		//i<=100 ->조건식 (참이어야만 실행블럭을 실행한다)
		//i++ -> 증감식
		for(int i=1; i<=100; i++)
		{//실행안한다 100까지의 합
			//조건식이 거짓이 될때까지
			sum += i;
		//System.out.println("sum : " + sum);
		}
		System.out.println("1~100까지의 합:" + sum);
	}
}
