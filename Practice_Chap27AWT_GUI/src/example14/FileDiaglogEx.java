package example14;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FileDiaglogEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("파일 다이얼로그");
		frame.setSize(200,200);
		
		//mode 기본값은 load이다 통상 로드와 세이브로 나누어 진다
		FileDialog fileopen = new FileDialog(frame,"파일열기",FileDialog.LOAD);
		FileDialog filesave = new FileDialog(frame,"파일열기",FileDialog.SAVE);
		
		frame.setVisible(true);
		fileopen.setVisible(true);
		filesave.setVisible(true);
		
		System.out.println(fileopen.getDirectory()+filesave.getDirectory());
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

}
