package example01;

public class AutoSaveThread extends Thread {
	
	public void save() {
		System.out.println("작업 내용을 저장함");
	}
	
	@Override
	public void run() {
		//1초단위로 save method를 호출함
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			this.save();
		}
	
	}
	
}
