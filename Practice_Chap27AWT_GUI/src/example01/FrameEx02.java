package example01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameEx02 {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Center");
		frame.setSize(300,200);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		//화면의 크기를 구허는 방법
		Dimension screen = toolkit.getScreenSize();
		System.out.println(screen);
		
		frame.setVisible(true);
		
		//화면 크기의 절반값에서 프레임의 크기의 절반 값을 뺀위치로 해야지
		//화면 가운데 위치하게 된다
		frame.setLocation((screen.width/2)-150,(screen.height/2)-100);
		
		frame.setVisible(true);
	}

}
