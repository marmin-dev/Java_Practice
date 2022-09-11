package example15;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FontEx {

	public static void main(String[] args) {
		Frame frame = new Frame("폰트");
		frame.setSize(500,500);
		
		String str ="So live a life you will remember";
		Label str1 = new Label(str);
		Label str2 = new Label(str);
		Label str3 = new Label(str);
		Label str4 = new Label(str);
		Label str5 = new Label(str);
		
		Font font1 = new Font("Serif",Font.PLAIN,20);
		Font font2 = new Font("Serif",Font.BOLD,20);
		Font font3 = new Font("Serif",Font.ITALIC,20);
		Font font4 = new Font("Serif",Font.BOLD+Font.ITALIC,20);
		Font font5 = new Font("HY고딕",Font.PLAIN+Font.ITALIC,20);
		
		//Label에 새로운 폰트 적용
		str1.setFont(font1);
		str2.setFont(font2);
		str3.setFont(font3);
		str4.setFont(font4);
		str5.setFont(font5);
		
		frame.setLayout(new FlowLayout());
		frame.add(str1);
		frame.add(str2);
		frame.add(str3);
		frame.add(str4);
		frame.add(str5);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		frame.setVisible(true);

	}

}
