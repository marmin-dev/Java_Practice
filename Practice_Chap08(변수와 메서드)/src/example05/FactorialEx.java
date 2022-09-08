package example05;

public class FactorialEx {

	public static void main(String[] args) {
	
		long result = FactorialEx.factorial(5L);
		System.out.println("5!(factorial)value : " + result);
		

	}

	public static long factorial(long n) {
		long result = 0L;
		//비로소 n이 1일때, 재귀호출이 더이상일어나지않는다.f(1)=1이니
		if(n==1) {
			result = 1;
		}
		else {
			System.out.println("result값 : "+ result +"n값 "+ n);
			result = n*factorial(n-1); //재귀호출이 직접적으로 이루어지는곳
		}
		return result;
	}
}
