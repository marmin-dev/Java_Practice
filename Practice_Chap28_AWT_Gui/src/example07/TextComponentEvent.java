package example07;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class TextComponentEvent extends Frame{
	
	TextField textField;
	TextArea textArea;
	
	public TextComponentEvent(String title) {
		super(title);
	}
	public void textComponentShow() {
		this.textField = new TextField();
		this.textArea = new TextArea();
		//프레임은 원래 Borderlayout이므로 아래와 같이 추가하면 된다
		this.add(textArea,"Center"); // 보더레이아웃 중간에 위치
		this.add(textField,"South");
		
		//TextField에 익명구현객체로 이벤트 정의하기
		this.textField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//TextField에서 엔터를 치면 TextArea 에 입력된 텍스트를 텍스트 에리아에 추가한다
				textArea.append(textField.getText() + "\n");
				//텍스트 필드의 내용 지우기
				textField.setText("");
				textField.requestFocus();
			}
		});
		//ActionEvent가 발생되는것은 4가지가 있다
		//1.button 클릭시
		//2.menu클릭시
		//3.Textfield 에서 엔터키를 눌렀을때
		//4.List의 item하나를 선택해서 더블클릭했을때
		//textfield의 글자를 편집하지 못하게한다
		this.textArea.setEditable(false);
		this.setSize(300,200);
		this.setLocation(500,300);
		this.setVisible(true);
		//focus가 실행됨과 동시에 textField에 위치하도록 설정한다
		this.textField.requestFocus();
		
//		this.addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		});
		WindowAdapter wad = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		this.addWindowListener(wad);
	}
}
