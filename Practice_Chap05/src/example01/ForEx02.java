package example01;

public class ForEx02 {

	public static void main(String[] args) {
//디버깅 : debug 창으로 의도치 않게 넘어갔다면, 프로그램의 문제이다
		//발생한 것으로 에러를 잡아나가는 과정을 디버깅이라 한다
		//브레이크 포인트 설정후 실행시키면 f8번을 누르면서 한단계씩 
		//진행시켜나가면서 변수의 값들을 살펴나가면 에러르 쉽게 잡을수 있
		
		
		
		
		
		int sum = 0;
		int temp = 0;
		for(int i=1; i<=100; i++)
		{
			sum += i;
			if(sum>=2000) {
				temp = i;
				break;
			}
		
		}
		System.out.println("2000이상일까지 i의:" +temp);
		
	}

}
