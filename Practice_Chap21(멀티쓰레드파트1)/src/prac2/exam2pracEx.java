package prac2;

import java.awt.Toolkit;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class exam2pracEx {

	public static void main(String[] args) {
//		Runnable runnable = new exam2prac();
//		Thread thread = new Thread(runnable);
//		thread.start();
//		for(int i =0;i<5;i++) {
//			System.out.println("뿍");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {}
//		}
	
//		Thread thread = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0;i<5;i++) {
//					toolkit.beep();
//					System.out.println("현재쓰레드 " + Thread.currentThread().getName());
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {}
//				}	
//			}
//		});
//		thread.start();
//		for(int i=0;i<5;i++) {
//			System.out.println("뿍");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {}
//		}
//		
		Thread thread = new Thread(()->{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			
			
		});
		
	}

}
