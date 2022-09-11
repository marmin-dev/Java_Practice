package example07;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextFieldEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("TextField");
		frame.setSize(400,80);
		frame.setLayout(new FlowLayout());
		
		Label lid = new Label("아이디 : " , Label.RIGHT);
		Label lpwd = new Label("패스워드 : " , Label.RIGHT);
		
		TextField id = new TextField(10); 
		TextField pwd = new TextField(10);
		pwd.setEchoChar('*');//입력한 값 대신에 이 별표가 출력되도록 한다
		System.out.println("설정한 에코 문자 : " + pwd.getEchoChar());
		
		frame.add(lid);
		frame.add(lpwd);
		frame.add(id);
		frame.add(pwd);
		frame.setVisible(true);
	}

}
