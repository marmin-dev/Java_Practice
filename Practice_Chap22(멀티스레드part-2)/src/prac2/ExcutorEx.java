package prac2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExcutorEx {

	public static void main(String[] args) {
		 
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		for(int i=0;i<20;i++) {
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolsize = threadPoolExecutor.getPoolSize();
					String threadname = Thread.currentThread().getName();
					System.out.println(poolsize);
					System.out.println(threadname);
					Integer.parseInt("삼");
				}
			};
			executorService.execute(runnable);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
		}
		executorService.shutdown();

	}

}
