package example08;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class CheckEx extends Frame{
	
	CheckboxGroup group;
	Checkbox cb1;
	Checkbox cb2;
	Checkbox cb3;
	
	//생성자에서 다 만들어 지고 있다
	public CheckEx(String title) {
		super(title);
		
		this.group = new CheckboxGroup();
		
		//아래 3개의 체크박스는 체크박스 그룹애 속하고 있으며,하나밖에 선택을 하지 못한다
		//또한 매개값중 3번째의 true는 실행시에 미리 체크를 하라고 한것이다
		this.cb1= new Checkbox("red",group,true);
		this.cb2= new Checkbox("green",group,false);
		this.cb3= new Checkbox("blue",group,false);
		
		//checkbox의  색상을 cyan으로 주고있다
		this.cb1.setBackground(Color.cyan);
		this.cb2.setBackground(Color.cyan);
		this.cb3.setBackground(Color.cyan);
		
		this.cb1.addItemListener(new EventHandler());
		this.cb2.addItemListener(new EventHandler());
		this.cb3.addItemListener(new EventHandler());
		
		this.setLayout(new FlowLayout());
		this.add(cb1);
		this.add(cb2);
		this.add(cb3);
		this.setBackground(Color.red);
		this.setSize(500,500);
		this.setLocation(500,300);
		this.setVisible(true);
		
		WindowAdapter wad = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		this.addWindowListener(wad);
		//중첩클래스인 IventHandler클래스는 ItenListner 인터페이스를 구현하고있다

		
		
	}
	class EventHandler implements ItemListener{
//		CheckBox에 버튼을 클릭을 하게되면 , itemstatechanged()가 호출된다
				@Override
				public void itemStateChanged(ItemEvent e) {
					System.out.println("Item이벤트 발생함");
					
					//getSource는 모든 이벤트 클래스의 조사인 자바 이벤트 오브젝트클래스에
					//있는 유일한 메서드 이면서 모든 이벤트 클래스에서 사용이 가능하다
					//리턴타입이 오브젝트라서 타입변환이 필요하다
					
					Checkbox cb = (Checkbox)e.getSource();
					String color = cb.getLabel();
					if(color.equals("red")) {
						//외부클래스에 접근하여 배경색 바꾸기
						CheckEx.this.setBackground(Color.red);
					}
					else if(color.equals("green")) {
						CheckEx.this.setBackground(Color.green);
					}
					else {
						CheckEx.this.setBackground(Color.white);
					}
						
				}
				
			}
}
