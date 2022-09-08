package example03;

public class SystemEx01 {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==5) {
			System.exit(0);//c언어에서 엑시트 제로랑 같은역할
			//break는 탈출문 exit는 프로그램 강제종료
			}
		}

	}

}
