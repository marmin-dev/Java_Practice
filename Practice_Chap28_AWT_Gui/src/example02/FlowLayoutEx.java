package example02;


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;



public class FlowLayoutEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("FlowLayout");
		frame.setSize(300,200);
		
		frame.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		
		frame.add(new Button("첫 번째"));
		frame.add(new Button("두 번째"));
//		frame.add(new Button("세 번째"));
//		frame.add(new Button("네 번째"));
//		frame.add(new Button("다섯 번째"));
//
//		frame.addWindowListener(new WindowAdapter() {
//			
//		)};
//		frame.setVisible(true);

	}

}
