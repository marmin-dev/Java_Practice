package example04;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.List;

public class ListEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("List");
		frame.setSize(300,200);
		frame.setLayout(null);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screensize = toolkit.getScreenSize();
		
		frame.setLocation((screensize.width/2)-150,(screensize.height/2)-150 );
		frame.setVisible(true);
		
		List list1 = new List();
		list1.setBounds(20,40,100,120);
		//아이템 추가
		list1.add("선생님");
		list1.add("대통령");
		list1.add("국회의원");
		list1.add("저격수");
		list1.add("김길환");
		list1.add("길한인생");
		
		frame.add(list1);
		frame.setVisible(true);
		
		//생성자의 두번째 인자값을 true로 설정을 하여 list목록중에
		//다중 선택이 될수 있도록 한다
		List list2 = new List(100,true);
		list2.setBounds(150,40,100,120);
		//아이템 추가
		list2.add("신은혁");
		list2.add("김길환");
		list2.add("아이유");
		list2.add("김민재");
		list2.add("장개방");
		
		frame.add(list2);
		frame.setVisible(true);
		frame.setResizable(true);
 	}

}
