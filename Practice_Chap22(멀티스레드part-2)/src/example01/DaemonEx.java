package example01;

public class DaemonEx {

	public static void main(String[] args) {
		
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		//setDaemon설정(필히,start()호출전에 설정을 해야한다.
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		//메인 스레드가 5초동안 정지하면,daemon스레드인 autoSaveThread가
		//실행되고, 메인스레드가 종료되면 더이상 오토세이브스레드가 더이상 실행이
		//안된다는 것을 알수가있다(종속적관계)
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println("메인 스레드 종료됨");
	}

}
