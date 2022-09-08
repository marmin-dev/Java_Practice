package example05;

public class ThreadA extends Thread {

	public ThreadA() {
		this.setName("ThreadA");
	}
	
	
	@Override
	public void run() {
		System.out.println("[현재 실행 중인 스레드] : "+this.getName());
		for(int i = 0;i<5;i++) {
			System.out.println(this.getName()+"가 출력한 내용 : "+i);
			//스레드으 이름을 얻는 2가지 방법
			//1번째
			//thread.currentthread().getName();
			//this.getName()
		
		}
	}
}
