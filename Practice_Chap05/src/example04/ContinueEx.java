package example04;

public class ContinueEx {

	public static void main(String[] args) {
		
		//1~100까지 사이에서 짝수만 출력하는 프로그램
		
		for(int i=1;i<=100;i++)
		{
			//continue 문은 뒷문장은 실행하지 아니하고
			//바로 증감식으로 이동한다.
			
			if((i%2)==0 && (i%3)==0)
			{
				System.out.println(i);
			}
			
			
		}

	}

}
