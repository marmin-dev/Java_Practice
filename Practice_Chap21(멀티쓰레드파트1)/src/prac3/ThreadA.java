package prac3;

import java.util.Iterator;

public class ThreadA extends Thread {
	public ThreadA() {
		this.setName("TheFxxkingAwesomeThreadA");
	}
	@Override
	public void run() {
		for(int i =0; i<5;i++){
			System.out.println("이 정의봉이 당신을 혼내줄것입니다");
			System.out.println(this.getName());
			System.out.println();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	
	}
	
}
