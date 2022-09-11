package example06;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class CheckBoxEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Check Box");
		frame.setSize(500,250);
		
		//프레임의 레이아웃 매니저는 borderlayout인데 여기서는 flow layout으로 설정
		//flowlayout방식은 배치의 한 방식으로 좌측에서 우측으로 컴포넌트를 정렬을 시킨다
		//지금은 왼쪽정렬을 선택했다
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		//check 박스는 개별적으로 생성을 하게 되면 다중 선택이 되어진다
		//true 를 매개값으로 주면 선택된 상태로 되어진다
		Label q1 = new Label("1.당신의 관심 분야는?");
		
		Checkbox news = new Checkbox("news",true);
		Checkbox kill = new Checkbox("kill",true);
		Checkbox shoot = new Checkbox("shoot",true);
		Checkbox folk = new Checkbox("folk",true);
		
		frame.add(q1);
		frame.add(news);
		frame.add(kill);
		frame.add(shoot);
		frame.add(folk);
		
		//체크박스를 생성하여 그룹 1로 만든다
		Label q2 = new Label("2. 얼마나 자주 극장에 가십니까"); //그룹생성
		CheckboxGroup group1 = new CheckboxGroup();
		
		//그룹을 매개값으로 주면 1개만 선택이 된다(라디오 버튼)
		Checkbox movie1 = new Checkbox("한달에 한번",group1,true);
		Checkbox movie2 = new Checkbox("한달에 두번",group1,false);
		Checkbox movie3 = new Checkbox("한달에 세번",group1,false);
		Checkbox movie4 = new Checkbox("한달에 네번이상",group1,false);
		
		frame.add(q2);frame.add(movie1);
		frame.add(movie2);frame.add(movie3);
		frame.add(movie4);
		
		
		
		
		frame.setVisible(true);
		

	}

}
