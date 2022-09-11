package prac1;

public class DaemonEx {
	public static void main(String[] args) throws InterruptedException {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		Thread.sleep(3000);
		System.out.println("작업을 종료합니다");
	}

}
