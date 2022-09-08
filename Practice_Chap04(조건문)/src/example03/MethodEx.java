package example03;

public class MethodEx {
	public static int add(int x, int y)
	{
		//메서드의 선언부 구성
		//리턴타입 (반환값)int
		//메서드명 
		//(): 매개 변수, 인자값 ,아규먼츠 다 같은 말이야!
		//메서드 선언부 중요도 98% 메서드 구현부 (정의부)
		//그니까 이게 그 c언어 함수랑 비슷하다는거지? 
		
		int temp = 0;
		temp = x+y;
		return temp;
	}

	public static void main(String[] args) {
		
		int num1=10;
		int num2=30;
		int result = add(num1,num2);
		//call by value 값에 의한 복사
		//call by reference 주소에 의한 복사
		//자주 쓰는것은 메서드로 만들어두고 두고두고 쓰
		System.out.println("num1 + num2 ="+result);
		//인수값과 인자값이 개수가 다르면 오류가 되는거야 
	}

}
