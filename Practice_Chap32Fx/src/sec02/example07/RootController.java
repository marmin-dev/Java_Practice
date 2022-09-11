package sec02.example07;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class RootController implements Initializable {
	
	@FXML private ProgressBar progress;
	@FXML private Label lblwork;
	@FXML private Button btnStart;
	@FXML private Button btnStop;
	private Task<Void> task;
	
	//결과 값이 없는 Task를 만들기 위해 Void타입 지정함
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//이벤트 처리부분 등록
		btnStart.setOnAction(e->btnStart(e));
		btnStop.setOnAction(e->btnStop(e));
		
	}
	public void btnStart(ActionEvent event) {
		System.out.println("BtnStart()실행 메서드명" + Thread.currentThread().getName());
		task = new Task<Void>() {

			@Override
			protected Void call() throws Exception {
				System.out.println("Call()실행 메서드명" + Thread.currentThread().getName());
				for(int i =0;i<=100;i++) {
					if(this.isCancelled()) {
						this.updateMessage("취소됨");
						break;
					}
				//i는 진행값을 의미하고 100은 범위
					//updataeProgresssBar progressIndicator에 한정
					this.updateProgress(i, 100);
					this.updateMessage(String.valueOf(i)+"%");
					
					//call()에는 예외처리가 되어있다.하지만 지금은 외부에서 인터럽트를 호출하면
					//task가 취소되도록 직접 예외 구면을 넣은 코드이다
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						if(this.isCancelled()) {
							this.updateMessage("인터럽트로 인한 취소");
							break;
						}
					}
					
				}
				return null;
			}
			
		};
		//속성 바인딩 코드
		//ProgressBar컨트롤의 속성과 task의 updateProgress의 속성과 progrss의 속성과 바인딩 처리를한다
		//이렇게 해주면 비로소 ProgressBar의 진행정도가 변하게 된다
		progress.progressProperty().bind(task.progressProperty());
		//위와 같이 label컨트롤의 속성과 updateMessage의 속성을 바인딩한다
		lblwork.textProperty().bind(task.messageProperty());
		
		Thread thread = new Thread(task);
		thread.setDaemon(true);
		thread.start();
	}
	
	public void btnStop(ActionEvent event) {
		System.out.println("BtnStart()실행 메서드명" + Thread.currentThread().getName());
		task.cancel();
		
	}
}
