package prac4;

public class GetGunEx {

	public static void main(String[] args) {
		GunCase gunCase = new GunCase();
		
		Thread a = new Soldiers(new GunCase(), "김병장");
		Thread b = new Soldiers(new GunCase(), "임병장");
		Thread c = new Soldiers(new GunCase(), "강병장");
		Thread d = new Soldiers(new GunCase(), "양병장");
		
		a.start();
		b.start();
		c.start();
		d.start();
	}

}
