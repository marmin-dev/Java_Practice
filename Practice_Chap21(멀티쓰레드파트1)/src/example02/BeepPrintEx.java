package example02;

import java.awt.Toolkit;

public class BeepPrintEx {
//main() 는 jvm이 실행한다
	public static void main(String[] args) {
	//직접 생성하는 멀티스레드 방법 3가지
		//방법1 구현 객체대입
//		Runnable runnable = new Beep();//구현객체대입
//		Thread thread = new Thread(runnable);
//		thread.start();
		//방법2 익명구현객체
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i = 0;i<5;i++) {
//					System.out.println("비프음 실행하는 스레드명" +
//							Thread.currentThread().getName());
//					toolkit.beep();
//					
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//					}
//				}
//				
//			}
//		});
//		thread.start();
		//방법3 -->람다식(함수적 인터페이스)JDK1.8코드절약,가독성 좋음
		Thread thread = new Thread(()->{
			
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0;i<5;i++) {
				System.out.println("비프음 실행하는 스레드명" +
						Thread.currentThread().getName());
				toolkit.beep();
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
			
		});
		thread.start();
		//다시 실행시키고 싶으면 다시 인스턴스를 찍어내야한다 뉴연산자로
		//스레드는 한번 스타트하고 다면 다시 재실행이 안된다
		for(int i=0;i<5;i++) {
			System.out.println("뿍");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			//싱글스레드를 멀티스레드로 바꿔서 프로그램을 만드는것
			//다른점이라면 메인에서 스레드를 실행하느냐? 와 구현한곳에서 실행하느냐
			//그것이 큰차이점이라 할수있다
		}
		
		
		

	}

}
