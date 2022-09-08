package example12;

public class WorkObject {

	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA()실행");
		notify(); //wait()에 의해 blocked된 스레드를 실행대기 상태로 깨운다
		
		try {
			wait();//노티파이 해줄때 까지 영원히잔다
		} catch (InterruptedException e) {}
	}
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB()실행");
		notify(); //wait()에 의해 blocked된 스레드를 실행대기 상태로 깨운다
		
		try {
			wait();//노티파이 해줄때 까지 영원히잔다
		} catch (InterruptedException e) {}
	}
	
	
}
