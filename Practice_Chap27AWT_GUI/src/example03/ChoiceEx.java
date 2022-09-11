package example03;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Choice");
		frame.setSize(300,200);
		frame.setLayout(null);
		//choice 라는 명칭은 거의 없다 다만 콤보박스나 드랍다운 리스트 라고 불리어 진다
		Choice choice = new Choice();
		//add choice component in choice comp
		choice.add("mon");
		choice.add("tue");
		choice.add("wen");
		choice.add("thu");
		choice.add("fri");
		choice.add("sat");
		choice.add("sun");
		System.out.println(choice.getItem(5));
		choice.setBounds(100,70,100,50);
		frame.add(choice);
		frame.setVisible(true);
	}

}
