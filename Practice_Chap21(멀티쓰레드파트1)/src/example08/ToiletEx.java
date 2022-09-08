package example08;

public class ToiletEx {

	public static void main(String[] args) {
			
		Toilet toilet = new Toilet();
		
		Thread thread1 = new UsingThread(toilet, "김길환");
		Thread thread2 = new UsingThread(toilet, "양길환");
		Thread thread3 = new UsingThread(toilet, "정길환");
		Thread thread4 = new UsingThread(toilet, "박길환");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

	}

}
