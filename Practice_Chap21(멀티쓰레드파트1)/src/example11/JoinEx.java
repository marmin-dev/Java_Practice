package example11;

public class JoinEx {

	public static void main(String[] args) {
		
		double avg = 0.0;
		long total = 0l;
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		} catch (InterruptedException e) {
		}
		
		total = sumThread.getSum();
		avg = total /10000.0;
		System.out.println("합 : "+total);
		System.out.println("평균 : "+avg);

	}

}
