package example15;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class FontListEx {

	public static void main(String[] args) {
		
	//그래픽스 인바이런먼트는 그래픽 디바이스 클래스 및 폰트클래스들을 포함하고있는 클래스이다
		GraphicsEnvironment gE = GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		Font[] fonts = gE.getAllFonts();
		
		for(int i=0; i<fonts.length;i++) {
			System.out.println(fonts[i].getFontName());
		}
	}

}
