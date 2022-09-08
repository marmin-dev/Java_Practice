package exmaple01;
class A{
	int data1=100;
	int data2=500;
}

public class AccumulatorEx {

	public static void main(String[] args) {
		
		Accumulator ac = new Accumulator();
		
		int iresult = ac.add(10, 50);
		System.out.println("iResult : " + iresult);
		
		long lresult = ac.add(100, 7500l);
		System.out.println("lResult : " + lresult);
		
		lresult = ac.add(1000l, 50);
		System.out.println("lResult : " + lresult);
		
		double dresult = ac.add(100.8, 30.3);
		System.out.println("dresult : " + dresult);
		
		long arrResult = ac.add(new int[] {1,2,3,4,5,6});
		System.out.println("arrResult : "+arrResult);
		
		iresult=ac.add(new A());
		System.out.println("iresult : "+iresult);
	}

}
