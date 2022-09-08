package prac2;

import java.awt.Toolkit;

public class exam2prac implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			System.out.println("현재 진행중인 쓰레드 : " + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		
	}
	

}
