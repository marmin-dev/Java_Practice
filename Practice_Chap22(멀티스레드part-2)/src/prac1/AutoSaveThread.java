package prac1;

public class AutoSaveThread extends Thread{
	
	public AutoSaveThread() {
		System.out.println("지금부터 자동 저장을 실행합니다");
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("자동 저장을 실행합니다");
			System.out.println("자동 저장 쓰레드" + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	
	}

}
