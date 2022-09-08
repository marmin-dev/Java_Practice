package example09;

public class StatePrintThread extends Thread{

	//스레드의 상태를 알아보기위해 멤버로 선언
	private TargetThread targetthread;
	
	public StatePrintThread(TargetThread tarThread) {
		this.targetthread=tarThread;
	}
	@Override
	public void run() {
		while(true) {
			//스레드의 상태정보를 알아낸다
			//Thread.State는 Thread클래스 Enum(열거형)타입이다
			Thread.State state = targetthread.getState();
			System.out.println("타겟 스레드의 상태 : "+state);
			if(state == Thread.State.NEW) {
				targetthread.start();
			}
			if(state==Thread.State.TERMINATED) {
				
				break;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
		
	}
}
