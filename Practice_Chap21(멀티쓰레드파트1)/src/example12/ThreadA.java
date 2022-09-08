package example12;

public class ThreadA extends Thread{
	//공유객체 선언
	private WorkObject worObject;
	public ThreadA(WorkObject workObject) {
		this.worObject=workObject;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			worObject.methodA();
		}
		System.exit(0);
	}

}
