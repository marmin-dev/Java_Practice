package example11;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class PanelEx {

	public static void main(String[] args) {
		Frame frame = new Frame("Panel");
		frame.setBounds(500,3030,500,300);
		frame.setLayout(null);
		
		//Panel은 종속적인 컨테이너로 기본적 플로우 레이아웃사용
		//따라서 패널 안에들어갈 컴포넌트의 위치를 따로 지정하지않아도 된다
		Panel panel = new Panel();
		panel.setBackground(Color.cyan);
		panel.setBounds(50,50,150,150);
		
		Button ok = new Button("ok");
		Button cancel = new Button("cancel");
		//이벤트 처리에서 버튼은 이벤트의 근원지이고 , 액션리스너는
		//버튼을 리스너(감시자)를 등록한후, 버튼이 클릭되었다면 아래 액션퍼롬드가 실행되는
		//것이 핸들러이다
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("OK 버튼 클릭함");
			}
		});
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cancel버튼 클릭함");
			}
		});
		//현재 버튼들의 Panel컨테이너에 추가가됟고 있기 떄문에 프레임 컨테이너에
		//영향을 받는것이 아니라 패널 컨테이너의 레이아웃매니저에 영향을 받는다는 사실도
		//반드시 인지해야한다
		frame.add(panel);
		panel.add(ok); panel.add(cancel);
		
//		frame.addWindowListener(new WindowListener() {
//			
//			@Override
//			public void windowOpened(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//				
//			}
//			@Override
//			public void windowClosed(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			@Override
//			public void windowActivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		//윈도우 어댑트 처리 부분, 매개변수가 윈도우 어댑터 클래스다
		//윈더우 어댑터 클래스는 윈도우 리스너의 인터페이스에 추상메서드들을
		//오버라이딩 해둔 클래스이다
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		//윈도우 이벤트를 사용하기위해서는 매개변수값으로 윈도우 리스너 인터페이스를 익명구현
		//객체로 제공을 하게되면 아래와 같이 필요없는 메서드 까지 우리가 
		//오버라이딩을 해야하는 불편함이 있다
		//코드량도 늘어날 뿐더러 아주 보기가 안좋다
		//하여 xxx어댑터 클래스를 사용해서 오버라이딩 하면 훨씬 편리하다
		
		
		
		frame.setVisible(true);
		
		

	}

}
