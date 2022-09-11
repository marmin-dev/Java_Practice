package example16;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PopupMenuEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Popup menu");
		frame.setSize(300,200);
		
		PopupMenu pMenu = new PopupMenu();
		MenuItem mcut = new MenuItem("잘라내기");
		MenuItem mCopy = new MenuItem("복사하기");
		MenuItem mPaste = new MenuItem("붙혀넣기");
		
		//팝럽메뉴에 메뉴아이템 추가함
		pMenu.add(mcut);
		pMenu.add(mCopy);
		pMenu.add(mPaste);
		
		frame.add(pMenu);
		
		//프레임에 이벤트 처리를 위해서 리스너를 추가하였다
		//마우스 어댑터 클래스를 추가하여 오버라이딩을 하는 익명자식객체 만들기
		frame.addMouseListener(new MouseAdapter() {
			private void pressed(MouseEvent e) {
			if(e.getModifiers()==MouseEvent.BUTTON1_MASK) {
				pMenu.show(frame, e.getX(), e.getY());
				System.out.println("마우스 포인터 x좌표 : " + e.getX());
				System.out.println("마우스 포인터 x좌표 : " + e.getY());
			}

			}
		}); 
		
		
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setVisible(true);

	}

}
