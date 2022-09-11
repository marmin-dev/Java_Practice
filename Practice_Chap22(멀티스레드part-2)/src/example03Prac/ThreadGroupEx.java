package example03Prac;

public class ThreadGroupEx {

	public static void main(String[] args) {
		ThreadGroup threadGroup1 = Thread.currentThread().getThreadGroup();
		String str = threadGroup1.getName();
		
		System.out.println(str);
		
	}

}
