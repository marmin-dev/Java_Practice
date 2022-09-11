package sec01.example01;

import javafx.application.Application;
import javafx.stage.Stage;
//Main은 항상 javafx.application.Application(추상클래스)을 항상 상속을 해야한다
public class AppMain  extends Application{
	//Application클래스의 start()를 반드시 오버라이딩 해야한다
	@Override
	public void start(Stage primaryStage) throws Exception {
		String threadName= Thread.currentThread().getName();
		System.out.println("Start 메서드 움직이는 스레드 : " + threadName);
		primaryStage.show(); //윈도우 창을 생성하여 보여줌
		
	}
	
	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println("main메서드 움직이는 스레드 : " + threadName);
		//launch()실행되면서 javaFx어플리케이션 스레드가 생성되어 start()가 호출된다
		Application.launch(args);

	}

}
