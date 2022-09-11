package example04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteSubmitEx {

	public static void main(String[] args) {
		//최대 2개의 쓰레드를 가지는 스레드 풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		for(int i=0;i<20; i++) {
			//20개의 작업 객체 만들기
			Runnable runnable =new Runnable() {
				
				@Override
				public void run() {
					//뉴픽스드 스레드풀과 뉴 캐시드 스레드풀은 내부적으로 스레드풀 익스큐터로 만들어졌기때문에 강제
					//타입변환이 가능하다
					
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					
					//현재 스레드 풀에 있는 스레드 개수를 리턴해줌
					int poolSize = threadPoolExecutor.getPoolSize();
					//작업실행 스레드명 얻기
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드 수 : " + poolSize + "]" + 
							"작업스레드 이름 : " + threadName);
					//일부러 예외발생시키기 익스큐트와 섭밋의 차이를 보기위해서 예외발생시킴
					Integer.parseInt("삼");
				}
			};
			
			//작업큐에 runnable 객체를 넣는 행위, execute()는 작업처리 도중에 예외가 발생하면
			//해당 스레드를 스레드풀에서 제거하고 새로운 스레드 생성된다.	submit()은 예외가 발생하더라도
			//해당스레드 풀에서 스레드를 제거하지 않고 재사용을 한다는 것을 알수가 있다 서브밋 메서드를 사용하는것이
			//좋다
			//executorService.execute(runnable);
			executorService.submit(runnable);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
		}
		executorService.shutdown();//스레드풀종료(작업큐에 있는 모든 작업을 마무리한후)
	}

}
