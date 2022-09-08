package prac1;

import java.awt.Toolkit;

public class exam1prac {

	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<10;i++) {
			toolkit.beep();
			System.out.println("현재 실행중인 쓰레드 이름 : "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println("뿍");
		}

	}

}
