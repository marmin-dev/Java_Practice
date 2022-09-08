package example01;

public class FieldInItEx {

	public static void main(String[] args) {
	//붕어빵을 찍어내는 과정	
	FieldInIt fi = new FieldInIt();
	System.out.println(fi.byteField);
	System.out.println(fi.boolField);
	System.out.println(fi.floatField);
	System.out.println(fi.arrField);
	//new 라는 연산자가 바이트 크기만큼 힙에다가 할당을 해준다
	//동시에 초기화를 시켜주는 역할을 한다.
	System.out.println(fi.toString());
	}

}
