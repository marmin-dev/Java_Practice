package example01;

public class VarEx03 {

	public static void main(String[] args) {
		
		byte b1 = 127;
		//byte b2 = b1 + 2;  //범위에 해당되지 않는다(오버플로우 발생)
		byte b2 = (byte)(b1 + 2); //type mismatch
		//강제 캐스
		System.out.println(b1);
		System.out.println(b2);
		
		int i1 = b1;//문제가 되지 않는다(자동캐스팅) 
	System.out.println("자동캐스팅 후 : " + i1);
	
	byte b3 = 127;
	int i2 = 400;
	b3 = (byte)i2;//큰 바이트 ->작은 바이트 (데이터 손실이 일어난다)
	System.out.println(b3);
	//boolean 은 캐스팅이 되지 않는다
	//정수와 실수간의 캐스팅은 저장하는 방식이 틀리기 때문에
	//반드시 데이터 손실이 있고 아룰러 명시적 캐스팅 코드가 들어가야한다.
	int i3 = 100;
	float f1 = (float)i3;
	System.out.println();
	
	float f2 = 10.55f;
	int i4 = (int)f2;
	System.out.println(i4);
	
	char ch = 'a';
	int i5 = ch; //작은바이트에서 큰바이트로 가는 형태
	System.out.println(i5);
	//문자 값을 정수 타입으로 바꾸게 되면
	//아스키 코드 값으로 바뀌게 된다 
	//모든 타입은 문자열이 붙으면 문자열 타입이 된다.
	int i6 = 100;
	String str = "" + i6;
	System.out.println(str);
	}

}
