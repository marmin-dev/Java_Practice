package example12;

public class WaitNotifyEx {

	public static void main(String[] args) {
		
		WorkObject workObject = new WorkObject();
		
		//실행코드에 가서 notify()와 wait()를 호출하는데 동기화 메서드로 되어있어
		//메서드 잠금이 일어나면서 서로 번갈아가면서 실행이 되는 것을 알수가 있다.
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();
		//스레드간의 협언 Object클래스의 메서드인 노티파이, 웨이트를 이용하면
		//된다. 동기화된 처리가 된 곳에서 호출하는 것이 바람직하다
	}

}
