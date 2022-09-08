package prac4;

public class Soldiers extends Thread{
	private GunCase guncase;
	public Soldiers(GunCase guncase, String name) {
		this.guncase = guncase;
		this.setName(name);
	}
	@Override
	public void run() {
		try {
			this.guncase.getGun();		
		} catch (Exception e) {}
	 
		
	}
}
