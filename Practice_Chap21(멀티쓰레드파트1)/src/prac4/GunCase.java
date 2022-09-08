package prac4;

public class GunCase {
	
	public synchronized void getGun() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name+"총 꺼내");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {}
		System.out.println(name + "총기함 최신화 완료!");
		
		
		
	}
}
