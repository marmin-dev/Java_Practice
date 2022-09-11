package example08;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class TextAreaEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("TextArea");
		frame.setSize(400,200);
		frame.setLayout(new FlowLayout());
		// 텍스트 에리아에 보여질 text를 저장한다
		//줄 row의 수를 지정한다
		//칼럼 열의 수를 지정한다
		TextArea tArea = 
			new TextArea("하고싶은말은?", 10, 50, TextArea.SCROLLBARS_BOTH);
		frame.add(tArea);
		//textarea의 텍스트를 전체 선택되도록 한다
		tArea.selectAll();
		frame.setVisible(true);
	}

}
