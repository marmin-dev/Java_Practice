package example12;

public class ThreadB extends Thread{
	//공유객체 선언
	private WorkObject worObject;
	public ThreadB(WorkObject workObject) {
		this.worObject=workObject;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			worObject.methodB();
		}
		System.exit(0);
	}

}
