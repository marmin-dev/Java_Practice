package example11;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class GraphicEx extends Frame implements MouseMotionListener{

	int x =0;
	int y =0;
	
	public GraphicEx(String title) {
		super(title);
		
		//리스너에 이벤트 등록
		this.addMouseMotionListener(this);
		
		//윈도우 종료기
		WindowAdapter we = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		this.addWindowListener(we);
		
		this.setBounds(100,100,500,500);
		this.setVisible(true);
		
	}
	
	//AWT스레드는 평소에 뒤에서 존재하다가, GUI애플리케이션 프로그램이 시작되면,
	//자동으로 Paint()를 호출한다. AWT스레드에 의해서 자동적으로 화면이 갱신되는 
	//상황을 정리를 해보면 아래와 같다
	//1.처음에 화면에 나타날때
	//2.다른화면에 가려져있던 부분이 다시 화면에 나타날때
	//3.아이콘화 되어있다가 원래 크기로 화면에 나타날때
	//하지만 위의 상황 이외에도화면에 다시 그려질수있도록 요청할수있다
	//그방법이 repaint를 호출하는 것이다. 사용자가 repaint()호출하면
	//AWT스레드는 Update를 호출하고 업데이트는 다시 페인트를 호출한다
	//repaint - awt스레드에게 화면을 갱신할것을 요청한다. 0.1초마다 확인을 한다
	//요청이 있으면 업데이트를 호출
	//업데이트 - 화면을 지우고 페인트를 호출한다
	@Override
	public void paint(Graphics g) {
		System.out.println("paint()를 움직이는 쓰레드" + Thread.currentThread().getName());
		g.drawString("커서를 움직이세요", 10, 20);
		g.drawString("*", this.x, this.y);
	}
	
	//리스너에 이벤트 등록
	@Override
	public void mouseDragged(MouseEvent e) {
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		this.x = e.getX();
		this.y = e.getY();
		
		this.repaint();
	}
	//update()는 원래 화면을 배경색으로 지우고, paint()를 호출하는데 지금은 오버라이딩을
	//했기때문에 화면이 지워지지 않고, 단지 paint()만 호출하고있다
	//화면이 사라졌다가 다시 활성화되면,paint()가 호출 되어지므로 화면에서 이전에 있던 내용의
	//사라지게 된다.그 이유는 Frame에 직접 그렸기 때문이다 다음 예제에서는 직접 이미지 클래스를
	//이용해서 가상화면에 그림을 그리고 실제화면 프레임에게 계속 복사하는 코드를 넣어주면
	//지워지지 않을것이다
	@Override
	public void update(Graphics g) {
		paint(g);
		
	}
	
}
