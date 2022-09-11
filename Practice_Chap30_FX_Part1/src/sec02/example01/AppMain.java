package sec02.example01;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;

public class AppMain extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//프로그램적 레이아웃
		//컨테이너 설정 및 각종 컨트롤들을 생성하고 배치하는 것이
		//전부 자바 코드로 이루어짐
		HBox hBox = new HBox();//루트컨테이너 신객체를 만들기위한 매개값
		hBox.setPadding(new Insets(10,10,10,10)); //안쪽여백 패딩을 설정
		hBox.setSpacing(10);//컨트롤의 간격을 10픽셀로 준다
		
		//TextField 컨트롤은 글자를 입력받을수 있는 컨트롤이다
		TextField textField = new TextField();
		textField.setPrefWidth(200); //폭을 설정
		
		Button button = new Button();
		button.setText("확인");
		
		//컨테이너에 컨트롤들을 배치하기 위해서 
		ObservableList<Node> list =  hBox.getChildren();
		list.add(textField);
		list.add(button);
		
		//화면에 루트컨테이너(parent)
		Scene scene = new Scene(hBox); //장면설정
		primaryStage.setTitle("AppMain"); //윈도우 타이틀 설정
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
	
		Application.launch(args);
	
	}
}
