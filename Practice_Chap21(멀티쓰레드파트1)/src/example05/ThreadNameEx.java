package example05;

public class ThreadNameEx {
	 
	public static void main(String[] args) {
		Thread thread =Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : " + thread.getName());
		
		
		Thread threaA =new ThreadA();
		System.out.println("ThreadA를 생성한 스레드 이름 : "+Thread.currentThread());
		System.out.println("main 스레드가 스레드A의 이름을 가져온 것 "+threaA.getName());
		threaA.start();
		Thread threaB =new ThreadA();
		System.out.println("ThreadB를 생성한 스레드 이름 : "+Thread.currentThread());
		System.out.println("main 스레드가 스레드A의 이름을 가져온 것 "+threaB.getName());
		threaB.start();
		//위의 코드들은 메인 쓰레드가 2개의 쓰레드를 생성해서 스타트를 시키는것
		//즉 파생되는것이다 비로소 스레드 에이와 스레드 비가 독립적실행이 되는것
	}
}
