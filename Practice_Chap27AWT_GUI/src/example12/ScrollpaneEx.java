package example12;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class ScrollpaneEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Scrollpane");
		frame.setSize(300,300);
		
		//스크롤 페인은 종속적 컨테이너롤 단 하나의 컴포넌트만 포함시킬수있는
		//컨테이너이다. 크기를 줄였다 늘였다 하면 스크롤바가 자동으로 생성되는것을
		//볼수가 있다
		ScrollPane sPane = new ScrollPane();
		Panel panel = new Panel();
		panel.setBackground(Color.gray);
		panel.add(new Button("첫 번째"));
		panel.add(new Button("두 번째"));
		panel.add(new Button("세 번째"));
		panel.add(new Button("네 번째"));
		
		sPane.add(new Button());
		sPane.add(new Button());
		sPane.add(new Button());
		sPane.add(new Button());
		
		frame.add(sPane);
		frame.add(panel);
		
		frame.setVisible(true);
		
	}

}
