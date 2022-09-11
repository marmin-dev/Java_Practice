package example13;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class DialogEx_NoEvent {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Dialog");
		frame.setSize(500,500);
		
		//parent Frame을 (상속관계가 아니다)frame 으로 하고 모달을 트루로해서 
		//필수응답 다이알로그로 한다.이렇게 되면 다이얼로그 창이 닫혀야 주윈도우인 프레임을
		//사용할수가 있다.하지만 폴스로 설정을 하게 되면 직접적으로 서로 행동한다
		
		Dialog dialog = new Dialog(frame, "info",true);
		dialog.setSize(150,100);
		
		//Dialog의 위치의 기준은 독립적인 컨테이너이기 떄문에 윈도우를 기준으로
		//위치를 잡는다
		dialog.setLocation(550, 50);
		dialog.setLayout(new FlowLayout());
		
		Label label = new Label("이 다이얼로그는 모달임",Label.CENTER);
		Button button = new Button("확인");
		dialog.add(label);
		dialog.add(button);
		
		dialog.setVisible(true);
		frame.setVisible(true);
		
		

	}

}
