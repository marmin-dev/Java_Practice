package example04;

import javax.swing.JOptionPane;

public class TimerEx {

	public static void main(String[] args) throws Exception{
		
		Thread thread =new TimerThread();
		thread.start();
		
		String input = JOptionPane.showInputDialog("10초 안에 값을 입력하시오 : ");
		if(input != null) {
			System.out.println("입력값 : "+input);
			System.exit(0);
		}
		else {
		Thread.sleep(1000);
		System.out.println("사망");
		System.exit(0);
		}
	}

}
