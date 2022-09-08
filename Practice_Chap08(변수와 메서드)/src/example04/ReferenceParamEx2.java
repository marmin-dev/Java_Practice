package example04;



public class ReferenceParamEx2 {

	public static void main (String[]args){
		
		A a =new A();
		a.data=77;
		System.out.println("메서드 호출전 main()내의 값" + a.data);
		
		//값만 읽을수가 있다. 값이 복사가 된것 
		//call by reference(주소에 의한호출)
		ReferenceParamEx2.dataChange(a);
		System.out.println("dataChange()호출후");
		System.out.println("메서드 호출 main()내의 값" + a.data);
		System.out.println("메서드 호출전 main()내의 값" + a.data);
	}
	//int[],int[] 스트링 전부 주소이다. 참조변수 참조변수형태로 호출을 해줘야한다.
	public static void dataChange(A a)
	{
		//a라는 주소값은 매개변수로 넘어왔기 때문에 주소를 공유한다.
		//a라는 주소를 공유하게 되면 호출한 곳에서 영향을 무조건 받는다.
		//지역변수 data 라는 값은 값복사가 이루어 졌기때문에 
		//호출한곳에서 아무런 영향을 받지 않는다.
		a.data=44;
		System.out.println("dataChange()내의 값 : "+ a.data);
		return;
	}
}

