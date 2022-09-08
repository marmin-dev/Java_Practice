package example05;

public class PowerEx {

	public static void main(String[] args) {
		long result = PowerEx.power(2, 4);
		System.out.println("2 ^ 5 : " + result);
		
	}

	public static long power(int x,int y)
	{	
		long result=0l;
		if(y==0)
		{
			return 1;
		}
		else {
			System.out.println(y + "회차 곱셈");
			result=x * PowerEx.power(x, y-1);
		}
		return result;
	}
	
}
