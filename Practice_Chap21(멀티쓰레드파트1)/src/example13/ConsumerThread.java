package example13;

public class ConsumerThread extends Thread{
	//공유객체 선언
	private DataBox dataBox;

	public ConsumerThread(DataBox dataBox) {
		this.setName("ConsumerThread");
		this.dataBox = dataBox;
	}
	@Override
	public void run() {
		for(int i=1; i<=5;i++) {
			String data = this.dataBox.getData();
			//System.out.println("가져온 데이터 : "+data);
		}
	
	}
	
	
	
	
	
}
