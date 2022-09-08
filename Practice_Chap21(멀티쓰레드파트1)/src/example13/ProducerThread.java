package example13;

public class ProducerThread extends Thread{
	//공유객체 선언
	private DataBox dataBox;

	public ProducerThread(DataBox dataBox) {
		this.setName("ProducerThread");
		this.dataBox = dataBox;
	}
	@Override
	public void run() {
		for(int i=1; i<=5;i++) {
			String data = "Data" + i;//데이터생산
			this.dataBox.setData(data);//데이타저장
		}
	
	}
	
	
	
	
	
}
