package prac3;

import example12.ThreadA;

public class FuxxingAwesomeEx {
	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		Thread threadA = new prac3.ThreadA();
		threadA.start();
		for(int i =0;i<5;i++) {
			System.out.println("하지만 정의는 영어로 definition이지");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		
		
		
		
		
	}
}
