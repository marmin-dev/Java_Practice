package sec01.example02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		FXMLLoader loader = new FXMLLoader(getClass().getResource("root.fxml"));
		//fxml로더 클래스의 인스턴스를 생성하고 있다
		Parent root = loader.load();
		
		//RootController의 참조를 얻는다
		RootController rootController = loader.getController();
		//RootController의 Setter를 호출함으로 primaryStage를 넘김으로써
		//RootController에서도 참조를 할수있게해준다
		rootController.setPrimaryStage(primaryStage);
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("메뉴");
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);

	}

}
