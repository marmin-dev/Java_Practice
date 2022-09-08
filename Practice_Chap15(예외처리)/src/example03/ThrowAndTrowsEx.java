package example03;

public class ThrowAndTrowsEx {

	public static void main(String[] args) {
		//boolean result = false;
		try {
			//result=
			findclass();
//			if(result) {
//				System.out.println("클래스가 존재합니다");
//			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
			
		}catch(Exception e) {
			//개발자용 배포시에는 제거나 주석처리
			e.printStackTrace();
		}finally {
			System.out.println("정상 종료합니다");
		}

	}
	public static void findclass() throws Exception{
		Class class1 = Class.forName("java.lang.String");
		throw new Exception("강제 예외발생");
//		if(class1 != null) {
//			return true;
//		}
//			else
//				return false;
//		}
	}
}


