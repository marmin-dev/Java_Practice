package prac2;

public interface RemoteCon {

	public void turnOn();
	public void turnOff();
	default void discharge(){
		System.out.println("Out off Battery Please Recharge");
	}
	
	
	
	
	
	
	
	
}
