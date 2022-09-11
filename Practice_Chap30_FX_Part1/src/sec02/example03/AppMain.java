package sec02.example03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//두개의 여백을 주는 방법을 잘 이해할 필요가 있다
		HBox hBox = new HBox();
		//hBox를 기준으로 하여, 안쪽 여백을 준다(들여쓰기 형태)
		
		//시계방항으로 돌아가는 안쪽여백
//		hBox.setPadding(new Insets(20,50,20,50));
//		
//		Button button = new Button();
//		button.setPrefSize(100, 100);
		
		//마진설정
		Button button = new Button();
		button.setPrefSize(100, 100);
		HBox.setMargin(button, new Insets(50,20,10,60));
		//버튼을 기준으로 해서 바깥여백이된다
		//HBox.setMargin()를 호출할때 매개값으로 컨트롤을 주게되면
		//컨트롤을 기준으로 마진 (바깥여백)이 설정이 된다
		
		hBox.getChildren().add(button);
		Scene scene = new Scene(hBox);
		primaryStage.setTitle("여백");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
