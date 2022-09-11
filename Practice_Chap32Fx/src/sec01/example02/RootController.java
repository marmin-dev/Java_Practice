package sec01.example02;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



public class RootController implements Initializable{

	@FXML VBox vBox;
	private Stage primaryStage;
	
	public RootController() {
		System.out.println("생성자호출");
	}


	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
		System.out.println("setter호출");
	}


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("이니셜라이즈 메서드 호출됨");
		}


	public void openFileChooser() {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(
		//getExtensionFilters()는 파일 확장만을 기준으로 필터링을 해주는 메서드이다
		//아울러 매개값으로 ExtensionFIlter객체를 가진다
			new ExtensionFilter("Txt Files(*.txt)","*.txt"),
			new ExtensionFilter("Image Files(*.png,*.jpg,*.gif)","*.png","*.jpg","*.gif"),
			new ExtensionFilter("Audio Files(*.mp3,*.aac)","*.mp3","&.aac"),
			new ExtensionFilter("All Files(*.*)","*.*")
				);
		//primaryStage의 참조를 얻어서 주윈도우로 설정을 해야한다
		File selFile = fileChooser.showOpenDialog(primaryStage);
		
		//2번째방법 으로 컨테이너나 컨트롤에서 직접 프라이머리스테이지의 참조를 얻기
	    //File selFile = fileChooser.showOpenDialog(vBox.getScene().getWindow());
		
		
		if(selFile != null) {
			System.out.println("선택파일 경로 : " + selFile.getPath());
			System.out.println("파일의 크기 : " + selFile.length());
		}
		
	}
	//파일저장다이얼로그
	public void saveFileChooser() {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(
			new ExtensionFilter("All Files(*.*)","*.*"));
		File selFile = fileChooser.showSaveDialog(primaryStage);
		if(selFile != null) {
			System.out.println("선택파일 경로 : " + selFile.getPath());
			System.out.println("파일의 크기 : " + selFile.length());
		}
		
	}
	//폴더선택
	public void openDirChooser() {
		DirectoryChooser dChooser = new DirectoryChooser();
		File selFolder = dChooser.showDialog(primaryStage);
		if(selFolder !=null) {
			System.out.println("선택된 폴더 경로 : " +selFolder);
		}
	}
	public void openPopChooser() throws IOException {
		Popup popup = new Popup();
		Parent parent = FXMLLoader.load(getClass().getResource("popup.fxml"));
		//lookup()의 매개변수가 fxml파일의 id값이 된다. 즉 id를 부여한 컨트롤을 찾는다
		//리턴타입이 노드이기 떄문에 이미지뷰로 다운캐스팅을하면된다
		//궁극적으로 이렇게 id를 사용해서 룩업을 사용하는 이유는 자바코드에서 동적으로 이미지를 설정해주기 위한것
		ImageView imageView = (ImageView)parent.lookup("#imgMessage");
		imageView.setImage(new Image(getClass().getResource("images/dialog-info.png").toString()));
		Label lblMeassage = (Label)parent.lookup("#lblMessage");
		lblMeassage.setText("New Notification");
		//popup창에다가 fxml파일 내용 추가하기
		popup.getContent().add(parent);
		popup.setAutoHide(true); //마우스의 포인터가 다른 윈도우로 가면 자동으로 닫히게끔함
		popup.show(primaryStage);
		
	}
	public void openCustoms() throws IOException {
		//바탕색이 흰색이고 제목과 닫기 버튼만 존재하는 stage생성
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage); //주윈도우설정
		dialog.setTitle("확인");
		
		Parent parent = FXMLLoader.load(getClass().getResource("custom.fxml"));
		
		Label txtTitle = (Label)parent.lookup("#txtTitle");
		txtTitle.setText("Are you sure?");
		txtTitle.setFont(new Font(30));
		Button btnOK = (Button)parent.lookup("#btnOk");
		btnOK.setOnAction( e -> dialog.close());
		Scene scene = new Scene(parent);
		dialog.setOnCloseRequest(e->System.out.println("다이얼로그 종료"));
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();
	}
	
	}