package example05;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class LabelEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Label");
		frame.setSize(300,200);
		frame.setLayout(null);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screen = toolkit.getScreenSize();
		
		frame.setLocation((screen.width/2)-150, (screen.height/2)-100);
		
		//라벨 생성(텍스트를 표시함)
		Label id = new Label("ID : ");
		id.setBounds(50,50,30,10);
		
		Label password = new Label("Password : ");
		password.setBounds(50,65,100,10);
		
		frame.add(id);
		frame.add(password);
		frame.setVisible(true);
		frame.setResizable(true);

	}

}
