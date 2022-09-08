package example02;

public class CarEx {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println(c1);
		
		Car c2 = new Car("흰색","오토",4);
		System.out.println(c2);
		
		Car c3 = new Car(c2);
		System.out.println(c3);
		//인스턴스를 복제할때 충분히 사용이 가능하다.
		for(int i=0; i<10; i++)
		{
			Car c = new Car(c2);
			System.out.println(i+"번째차 : "+c);
		}
		Car c4 =new Car("검정");
		System.out.println(c4);
		Car c5 =new Car("검정",4);
		System.out.println(c5);
	}

}
