package example09;

import java.awt.Frame;
import java.awt.Scrollbar;

public class ScrollBarEx {

	public static void main(String[] args) {
		
		//스크롤바는 사용자가 정해진 범위내에 있는 값을 선택할수 있도록
		//해주는 컴포넌트이다 주로 볼륨설정 색상선택같은곳에 자주 사용한다
		Frame frame = new Frame("스크롤바");
		frame.setSize(300,200);
		frame.setLayout(null);
		
		//수평스크롤바
		Scrollbar hor =
				new Scrollbar(Scrollbar.HORIZONTAL,0,50,0,100);
		hor.setSize(100,15);
		hor.setLocation(60,100);
		
		
		Scrollbar ver =
				new Scrollbar(Scrollbar.VERTICAL,0,50,0,100);
		ver.setSize(15,100);
		ver.setLocation(30,30);
		
		frame.add(hor);
		frame.add(ver);
		frame.setVisible(true);
		
	}

}
