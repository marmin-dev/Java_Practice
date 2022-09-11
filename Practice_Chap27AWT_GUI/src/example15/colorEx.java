package example15;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class colorEx {

	public static void main(String[] args) {
		
		//그리드 레이아웃을 이용하여 14행 2열의 표와같은 형태로 레이아웃을 설정하였다
		Frame frame = new Frame("Color");
		frame.setLayout(new GridLayout(6,2));
		frame.setSize(250,300);
		
		Panel p1 = new Panel();
		p1.setBackground(Color.black);
		
		Panel p2 = new Panel();
		p2.setBackground(Color.blue);
		
		Panel p3 = new Panel();
		p3.setBackground(Color.green);
		
		Panel p4 = new Panel();
		p4.setBackground(Color.DARK_GRAY);
		
		Panel p5 = new Panel();
		p5.setBackground(new Color(50,100,100));
		
		Panel p6 = new Panel();
		p6.setBackground(new Color(255,0,0));
		
		frame.add(new Label("Color.black"));	frame.add(p1);
		frame.add(new Label("Color.blue"));		frame.add(p2);
		frame.add(new Label("Color.green"));	frame.add(p3);
		frame.add(new Label("Color.darkgray"));	frame.add(p4);
		frame.add(new Label("Color.50,100,100"));frame.add(p5);
		frame.add(new Label("Color.100.0f,100.0f,0.5"));frame.add(p6);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setVisible(true);
	}

}
