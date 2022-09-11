package sec01.example02;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{
	//실행스레드가 바로 자바 fx어플리케이션 스레드
	public AppMain() {
		System.out.println("생성자 호출");
		System.out.println("생성자 스레드 명 : " + Thread.currentThread().getName());
	}
	
	//실행스레드 : javaFX-Launcher 스레드
	@Override
	public void init() throws Exception {
		System.out.println("init()메서드 실행 : ");
		System.out.println("생성자 스레드명 : " + Thread.currentThread().getName());
	}
	
	//실행스레드 : 자바 fx어플리케이션 스레드
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("Strat() 실행 : ");
		System.out.println("Start 스레드명 : " + Thread.currentThread().getName());
	}
	
	@Override
	public void stop() throws Exception {
		//윈도우 창에서 x표시를 클릭시에 자동으로 호출
		//Application P/G에서 종료시에 해야하는 것들 실행
		System.out.println("Stop() 실행 : ");
		System.out.println("Stop 스레드명 : " + Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
		
		
	}

}
