package sec02.example06;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootController implements Initializable {

	@FXML private Label lblTime;
	@FXML private Button btnStart;
	@FXML private Button btnStop;
	
	private boolean stop;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//이벤트 처리 부분
		btnStart.setOnAction(e->BtnStart(e));
		btnStop.setOnAction(e->BtnStop(e));
	}


	private void BtnStart(ActionEvent e) {
		this.stop =false;
		Thread thread = new Thread() {
			public void run() {
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
				while(!stop) {
					String strTime = sdf.format(new Date());
					//System.out.println("run() thread" + Thread.currentThread().getName());
					
					Platform.runLater(()->{
						//System.out.println("runLater 호출됨");
						//System.out.println("runLater() thread" + Thread.currentThread().getName());
						//UI변경코드
						lblTime.setText(strTime);
					});
				
				}
			};
		};
		thread.setDaemon(true);
		thread.start();
	}


	private void BtnStop(ActionEvent e) {
		this.stop=true;
		
	}

}
