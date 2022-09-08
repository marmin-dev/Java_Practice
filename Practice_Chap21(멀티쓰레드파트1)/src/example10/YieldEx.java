package example10;

public class YieldEx {

	public static void main(String[] args) throws Exception{
		
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
		
		//2초동안은 ThreadA,ThreadB번갈아 가면서 작업을 한다
		Thread.sleep(2000);
		
		threadA.work = false;
		Thread.sleep(2000);
		threadA.work = true;
		
	}

}
