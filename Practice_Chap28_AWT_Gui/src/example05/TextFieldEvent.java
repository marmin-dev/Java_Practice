package example05;


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


@SuppressWarnings("serial")
public class TextFieldEvent extends Frame{


		
		Label lId;
		Label lPwd;
		TextField tfId;
		TextField tfPwd;
		Button ok;

		public TextFieldEvent (String title) {
			super(title); //조상 클래스인 frame 을 호출함
		}
		public void textFieldShow() {
			this.lId = new Label("ID : ", Label.RIGHT);
			this.lPwd = new Label("PassWord : ", Label.RIGHT);
			
			this.tfId = new TextField(10);
			this.tfPwd = new TextField(10);
			this.tfPwd.setEchoChar('*'); //비밀번호 안보이게 설정
			
			this.ok = new Button("OK");
			this.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			//리스너 등록
			this.tfId.addActionListener(new EventHandler());
			this.tfPwd.addActionListener(new EventHandler());
			this.ok.addActionListener(new EventHandler());
			
			this.setLayout(new FlowLayout());
			this.add(lId);
			this.add(tfId);
			
			this.add(lPwd);
			this.add(tfPwd);
			
			this.add(ok);
			this.setSize(450,500);
			this.setLocation(500,300);
			this.setVisible(true);
			this.setResizable(false);
			
		}
		
		//내부 클래스 작성
		class EventHandler implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = tfId.getText().trim();
				String pwd = tfPwd.getText().trim();
				
				if(!id.equals("spark")) {
					System.out.println("입력하신 아이디는 조선천지에 없습니다");
					tfId.requestFocus(); // 마우스 커서 (포커스)를 다시 아이디
					//창으로 보냄
					tfId.selectAll(); //입력한 글자를 전부 선택되게끔함
				}
				else if(!pwd.equals("12345")) {
					System.out.println("입력하신 비밀번호는 조선천지에 없습니다");
					tfPwd.requestFocus(); // 마우스 커서 (포커스)를 다시 아이디
					//창으로 보냄
					tfPwd.selectAll(); //입력한 글자를 전부 선택되게끔함
				}
				else {
					System.out.println("환영합니다");
				}
				
			}
			
		}
		
		
}
