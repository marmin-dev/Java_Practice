package sec02.example01;

public class RunnableEx {

	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				for(int i =0;i<10;i++) {
					System.out.println(i);
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {}
		System.out.println("-----------------------");
		//람다식으로 직접 작성하여 thread의 매개값으로 주는 코드
		runnable = ()->{
			for(int i =0;i<10;i++) {
				System.out.println(i);
			}
		};
		thread = new Thread(runnable);
		thread.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {}
		
		System.out.println("-----------------------");
		//바로 람다식 사용하기
		thread = new Thread(()->{
			for(int i =0;i<10;i++) {
				System.out.println(i);
			}
		});
		thread.start();
	}

}
