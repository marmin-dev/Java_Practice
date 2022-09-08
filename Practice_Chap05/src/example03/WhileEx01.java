package example03;

public class WhileEx01 {

	public static void main(String[] args)
	{
//		int sum = 0;
//		int i = 1;
//		while(i<=100)
//		{
//			sum+=i;
//			i++;
//		}
		//System.out.println("1~100까지의 합 : "+sum);
		//while 문은 무한루프로 많이 사용함
		//while 문은 보통 무한루프용으로 많이 사용된다.if 문과 break 문
		//무한루프를 벗어날 코드를 작성 해주시는게 맞다.
		int i=1;
		while(true) {
			
			if(i>=100) {
				break;
			}
			System.out.println(i);
			i++;
		}
	}
}
