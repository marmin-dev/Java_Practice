package example04;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("CardLayout");
		
		//Layout을 직접 생성해서 대입을 하는것이다
		CardLayout card = new CardLayout(10,10);
		frame.setLayout(card);
		
		//프레임에 종속될 컨테이너인 패널을 3개 생성
		Panel card1 = new Panel();
		card1.setBackground(Color.DARK_GRAY);
		card1.add(new Label("card1 Dark Gray"));
		
		Panel card2 = new Panel();
		card2.setBackground(Color.yellow);
		card2.add(new Label("card2 yellow"));
		
		Panel card3 = new Panel();
		card3.setBackground(Color.cyan);
		card3.add(new Label("card3 cyan"));
		
		//프레임에다가 카드를 3개 추가하고 있다
		frame.add(card1);
		frame.add(card2);
		frame.add(card3);
		
		//중첩클래스 핸들러,마우스어댑터를 상속받고 있다
		//마우스 이벤트 핸들링을 해주는 역할을 한다
		class Handler extends MouseAdapter{
			@Override
			public void mouseClicked(MouseEvent e) {
				//마우스 오른쪽 버튼을 눌렀을때
				if(e.getModifiers()==MouseEvent.BUTTON3_MASK) {
					System.out.println(e.getModifiers());
					//이전 패널을 보여줌
					card.previous(frame);
				}
				else {
					System.out.println(e.getModifiers());
					//이전 패널을 보여줌
					card.next(frame);
				}
			}
			
		}
		//MouseAdapter 클래스는 MouseListner 인터페이스를 구현하고 있기때문에
		//핸들러의 인스턴스가 매개변수로 들어갈수가있다
		card1.addMouseListener(new Handler());
		card2.addMouseListener(new Handler());
		card3.addMouseListener(new Handler());		
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		frame.setSize(300,300);
		frame.setLocation(500,300);
		//프레임에 추가된 패널중애 처음으로 추가된 것을 보여준다
		card.first(frame);
		frame.setVisible(true);

	}

}
