package example01;

import java.awt.Toolkit;

public class BeepPrintEx {
//main() 는 jvm이 실행한다
	public static void main(String[] args) {
		//현재 실행중인 스레드 명을 출력하는 코드
		//System.out.println(Thread.currentThread().getName());
		
		//Toolkit은 AWT 어브스트랙 윈도우 툶킷 추상클래스인데 그중에 GUI관련된 메서드들로
		//구성되어진 인스턴스를 getDefaultToolkit 메서드를 통해서 툴킷클래스의 참조얻어내기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			System.out.println("for문을 실행하는 스래드 이름 : "+
		Thread.currentThread().getName());
			toolkit.beep();//비프음출쓰레드가 너무빨라서 한번만나옴
			//쓰레드가 너무 빨라서 0.5초간 멈춘다
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
		for(int i=0;i<5;i++) {
			System.out.println("뿍");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			//싱글스레드를 멀티스레드로 바꿔서 프로그램을 만드는것
		}
		
		
		

	}

}
