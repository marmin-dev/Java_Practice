package example04;

class A{
	int data;
}

public class PrimitiveParamEx {

	public static void main (String[]args){
		
		A a =new A();
		a.data=77;
		System.out.println("메서드 호출전 main()내의 값" + a.data);
		PrimitiveParamEx.dataChange(a.data);
		//값만 읽을수가 있다. 값이 복사가 된것 
		//call by value(값에 의한복사)
		System.out.println("dataChange()호출후");
		System.out.println("메서드 호출 main()내의 값" + a.data);
		System.out.println("메서드 호출전 main()내의 값" + a.data);
	}
	public static void dataChange(int data)
	{
		
		//지역변수 data 라는 값은 값복사가 이루어 졌기때문에 
		//호출한곳에서 아무런 영향을 받지 않는다.
		data=44;
		System.out.println("dataChange()내의 값 : "+ data);
		return;
	}
}
