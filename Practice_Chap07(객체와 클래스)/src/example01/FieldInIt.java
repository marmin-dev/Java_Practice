package example01;
//설계도 붕어빵 틀을 만드는 작업
public class FieldInIt {
	byte byteField;		//1
	short shortField;	//2
	int intField;		//default4
	long longField;		//8
	
	boolean boolField;	//1
	char charField;		//2
	
	float floatField;	//4
	double doubleField;	//8
	//참조형변수
	int[] arrField;		//4
	String strField;	//4
	//클래스 안에 뉴연산자로 만들어지는 멤버변수는 자동으로 초기화해준다.
	//annotation 컴파일러에게 강한 컴파일 요구
	//toString 은 클래스의 멤버변수의 값들을 수시로 확인하고자 할때나
	//원하는 포맷으로 출력하고자할때 많이사용한다.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
