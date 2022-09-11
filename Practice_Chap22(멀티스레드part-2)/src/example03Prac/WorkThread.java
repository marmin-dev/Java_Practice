package example03Prac;

public class WorkThread extends Thread{
	
	public WorkThread(ThreadGroup threadGroup, String name) {
		super(threadGroup,name);
	}
	@Override
	public void run() {
	ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
	System.out.println(mainGroup.getName());
	
	while(true){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("인터럽트 발생!");
			break;
		}
	}
	System.out.println("Remember me");
	}

}
