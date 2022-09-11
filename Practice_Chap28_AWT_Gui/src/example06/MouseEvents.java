package example06;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;




@SuppressWarnings("serial")
public class MouseEvents extends Frame{

	private Label location;
	
	public MouseEvents(String title) {
		super(title);
	}
	
	public void MouseShow() {
		this.setSize(300,200);
		this.setLocation(500,300);
		//라벨에 대한 설정
		this.location = new Label("");
		this.location.setBounds(50,50,200,20);
		this.location.setBackground(Color.yellow);
		this.add(location);
		
		//마우스 클릭에 대한 이벤트 감지기 등록
		this.addMouseListener(new EventHandler());
		//마우스 이동에 대한 이벤트 감지기 등록
		
		
		this.addMouseMotionListener(new EventHandler());
		this.setLayout(null);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		}
	class EventHandler extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
				//메인스레드가 이러한 이벤트를 처리해 주는것이 아니라,
				//AWT스레드가 직접 처리를 하고 있음을 확인할수가있다
				System.out.println(Thread.currentThread().getName());
				System.out.println(e.getX() + ","+ e.getY());
			}
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			System.out.println(Thread.currentThread().getName());
			location.setText("Mouse 좌표" + e.getX() + " ,"+ e.getY());
		}
		
	}
}
