package example13;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class dialog_Ex_event {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Dialog");
		frame.setSize(500,500);
		
		Dialog dialog = new Dialog(frame, "info",true);
		dialog.setSize(150,100);
		
		dialog.setLocation(550, 50);
		dialog.setLayout(new FlowLayout());
		
		Label label = new Label("이 다이얼로그는 모달임",Label.CENTER);
		Button button = new Button("확인");
		
		button.addActionListener(new ActionListener() {
			//버튼을 클릭하면 다이얼로그가 사라진다 아울러 디스포스를 이용해서
			//메모리가 제거된다
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(false);
				dialog.dispose();
			}
		});
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		dialog.add(label);
		dialog.add(button);
		frame.setVisible(true);
		dialog.setVisible(true);
		
		
		
	}
}
