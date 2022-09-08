package example06;

public class PriorityEx {

	public static void main(String[] args) {
		
		
		Thread thread1 = Thread.currentThread();
		System.out.println(thread1.getName()+" : "+thread1.getPriority());
		
		for(int i =1; i<=20;i++) {
			Thread thread = new CalcThread("Thread"+i);
			//쓰레드 1234는 우선순위가 가장낮다
			if(i!=10) {
				thread.setPriority(Thread.MIN_PRIORITY);
				//thread.setPriority(1);
			}
			else {
				thread.setPriority(Thread.MAX_PRIORITY);
				//thread.setPriority(10);
			}
			thread.start();
		}//쓰레드 우선순위는 100프로 우선끝난다는 결론을 무조건적으로 내진않는다
		//어차피 자바는 순환할당 방식을 사용하고 있기떄문에
		//CPU스케쥴의 상태에 따라 달라진다

	}

}
