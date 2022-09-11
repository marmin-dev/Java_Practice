package example05;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultEx {

	public static void main(String[] args) {
		//newFixedThreadPull없이 내pc의 코어수만큼 최대 스레드 수로 준다
		ExecutorService excExecutorService =Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		System.out.println("코어수 : "+Runtime.getRuntime().availableProcessors());
		
		//Runnable 익명구현객체 생성(작업객체)-->리턴값이 없다
		System.out.println("[작업처리 요청]");
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				int sum=0;
				for(int i=1;i<=10;i++) {
					sum+=i;
				}
				System.out.println("[작업처리 결과] : " + sum);
			}
		};
		//작업큐에 작업(runnable객체)을 넣는다.
		//작업이 완료될때 까지 블로킹 즉 기다린다.future은 지연완료 객체이다
		Future<?> future = excExecutorService.submit(runnable);
		
		try {
			//get()는 작업객체가 작업을 완료할때까지 기다린다
			Object obj = future.get();
			String str = (String)obj;
			System.out.println("작업처리완료");
			System.out.println("Futre의 get method 가 리턴한값" + str);
		} catch (InterruptedException | ExecutionException e) {}
		
		//스레드 풀 종료
		excExecutorService.shutdown();
	}

}
