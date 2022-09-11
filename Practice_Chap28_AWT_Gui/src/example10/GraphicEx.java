package example10;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class GraphicEx extends Frame {
	
	public GraphicEx(String title) {
		super(title);
		this.setBounds(100,100,400,300);
		this.setVisible(true);
		
		//창닫기 인스턴스
		WindowAdapter we = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		this.addWindowListener(we);
	}
	@Override
	public void paint(Graphics g) {
		//AWT 스레드가 paint()호출하고 그림까지 그려주는 역할을 한다
		System.out.println(Thread.currentThread());
		g.setFont(new Font("Serif",Font.PLAIN,15));
		g.drawString("그림그리기", 10, 50);//문자열출력
		
		//타원을 그리는 부분
		g.drawOval(50, 100, 100, 50);
		//파란색으로 색깧을 지정을 한것임
		g.setColor(Color.blue);
		//filloval()은 색깔채우기 메서드임
		g.fillOval(50, 100, 100, 50);
		
		//선을 그린다
		g.setColor(Color.red);
		g.drawLine(100, 100, 150, 150);
		
		//둥근 사각형 그리기
		g.fillRoundRect(200, 100, 120, 80,30,30);
		
		//호 그리기
		g.setColor(Color.orange);
		g.fillArc(250, 200, 100, 100, 0, 120);
	}
}
