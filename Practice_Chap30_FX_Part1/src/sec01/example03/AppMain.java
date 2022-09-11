package sec01.example03;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Vbox는 컨테이너 클래스의 한종류이며, 수직으로 내용(컨트롤)들을
		//배치하는 컨테이너이다
		VBox rootBox = new VBox();
		//윈도우의 넓이 설정
		rootBox.setPrefWidth(500);
		rootBox.setPrefHeight(350);
		rootBox.setAlignment(Pos.CENTER);
		rootBox.setSpacing(20);
		
		Label label = new Label();
		label.setText("안녕 자바 FX");
		label.setFont(new Font(50));
		
		Button button = new Button();
		button.setText("확인");
		button.setOnAction( event -> Platform.exit());
		
		//익명구현객체를 직접 만들어서 이벤트 핸들링(함수적 인터페이스)
//		button.setOnAction(new EventHandler<ActionEvent>() {
//			
//			@Override
//			public void handle(ActionEvent event) {
//				System.out.println("윈도우 종료");
//				Platform.exit();
//			}
//		});
		//vBox컨테이너에 컨트롤들을 배치함
		ObservableList<Node> list = rootBox.getChildren();
		list.add(new Label("Hello~"));
		list.add(label);
		list.add(button);
		//rootBox.getChildren().add(label);
		
		//scene의 생성자의 매개값은 Parent라는 추상클래스이다
		//하여, Vbox는 parnet를 상속받으므로 매개값으로 들어가는데 문제가 없다
		//통상 컨테이너가 매개값으로 들어간다
		Scene scene = new Scene(rootBox);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
		
	}
	
//	1.먼저 stage가 무대라는 것 즉 윈도우 창에 해당한다
//	2. 그 stage가 설정되면 장면 즉 scene을 만들어서 설정해준다
//	3. scene을 설정할때 매개값은 통상 Parent 클래스가 오는데
//	추상클래스이므로 하위 컨테이너 클래스를 넘겨준다
//	4. Parent 클래스를 상속받는 컨테이너에 각종 컨트롤을 추가배치한다
	
}
