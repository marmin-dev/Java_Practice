package example06;

public class Compare {

	//매개변수 T타입을 Number(추상클래스)타입이거나 Number클래스를 상속받는 자손
	//클래스만 T타입으로 들어올 수 있다 (상위타입을 제한)
	public static <T extends Number> int compare(T t1,T t2) {
		
		//넘버클래스의 더블밸류메서드는 원래 추상메서드이지만
		//자손클래스 인티져난 더블등이 올수가 있는 자손클래스가 
		//더블밸류라는 메서드를 오버라이딩을 했기에 문제가 되지 않는다
		double val1 = t1.doubleValue();
		double val2 = t2.doubleValue();
		
		
		
		return Double.compare(val1, val2);
	}
}
