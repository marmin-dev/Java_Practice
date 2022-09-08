package exmaple01;

public class Accumulator {
	
	public int add(int x , int y) {
		System.out.println("add(int x , int y)");
		return x+y;
	}
//	public int add(int a , int b) {
//		return x+y;
//	} 오버로딩이 성립되지 않는다
	public long add(int x , long y) {
		System.out.println("add(int x , long y)");
		return x + y; 
	}
	//add라는 메서드명으로 오버로딩 하고있다
	 public long add(long x,int y)
	 {
		 System.out.println("add(long x,int y)");
		 return x + y;
	 }
	 public double add(double x,double y) {
		 System.out.println("add(double x,double y)");
		 return x+y;
	 }
	//참조형 변수를 받아서 오버로딩하는 케이스
	 public long add(int[] arr) {
		 System.out.println("add(int[] arr)");
		long sum = 0;
		for(int i:arr) {
			sum += i;
		}
		return sum;
		//오버로딩 메서드가 한개임에도 불구하고 여러개의 기능을 할수있도록!
		
	 }
	 public int add(A a) {
		 System.out.println("add(A,a)");
		 return a.data1+a.data2;
	 }
}
