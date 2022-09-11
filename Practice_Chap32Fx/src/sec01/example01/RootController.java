package sec01.example01;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;



public class RootController implements Initializable{
	
	@FXML private ComboBox<String> comboBox;
	@FXML private TextArea textArea;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		}
	public void handleNew(ActionEvent event) {
		//setText는 이벤트 처리가 될때마다 새로 갱신하므로 append
		textArea.setText("새로 만들기\n");
	}
	public void handleOpen() {
		textArea.appendText("열기\n");
	}
	public void handleSave() {
		textArea.appendText("저장하기\n");
	}
	public void handleExit() {
		textArea.appendText("끝내기\n");
		Platform.exit();
	}
	public void handleCombo() {
		if(comboBox.getValue().equals("공개")) {
			textArea.appendText("공개\n");
		}
		else {
			textArea.appendText("비공개\n");
		}
	}
	
	}