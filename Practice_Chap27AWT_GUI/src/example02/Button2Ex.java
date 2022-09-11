package example02;

import java.awt.Button;
import java.awt.Frame;

public class Button2Ex {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Button");
		frame.setSize(300,200);
		frame.setLayout(null);
		
		Button b1 = new Button("access");
		Button b2 = new Button("deni");
		
		b1.setSize(200,100);
		b2.setSize(300,100);
		
		frame.add(b1);frame.add(b2);
		
		frame.setVisible(true);
		frame.setResizable(true);

	}

}
