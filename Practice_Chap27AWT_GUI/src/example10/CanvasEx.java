package example10;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class CanvasEx {

	public static void main(String[] args) {
		Frame frame = new Frame("Canvas");
		frame.setSize(300,200);
		frame.setLayout(null);
		
		//Canvas는 현재시점에서는 현재시점에서는 많이 퇴색되어 사용하지않는다
		//현재는 이미지뷰 , 라벨 ,미디어 뷰등으로 대체되어 졌다
		Canvas canvas = new Canvas();
		//canvas 의 배경색을 노란색으로 한다
		canvas.setBackground(Color.yellow);
		canvas.setBounds(50,50,150,100);
		frame.add(canvas);
		frame.setVisible(true);
		
	}

}
