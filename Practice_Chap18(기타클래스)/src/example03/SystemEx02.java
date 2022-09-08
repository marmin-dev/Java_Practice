package example03;

public class SystemEx02 {

	public static void main(String[] args) {
		
		//프로그램의 성능을 테스트 할때 유용한 메서드
		long sum =0l;
		//long start = System.currentTimeMillis();
		//밀리타임 1초의 10^3분의 1 나노타임 10^9분의 1
		long start = System.nanoTime();
		for(int i=1; i<10000000;i++) {
			sum += i;
			
		}
		long end = System.nanoTime();
		System.out.println(sum);
		System.out.println("소요된 시간 : " + (end-start)+"ns");
		System.out.println("소요된 시간 : " + (end-start)+"ns");
	}

}
