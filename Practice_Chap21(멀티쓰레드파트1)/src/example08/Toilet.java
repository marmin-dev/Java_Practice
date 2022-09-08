package example08;
//공유객체
public class Toilet {
	//플래그 변수
	//private boolean seat;
	//메서드 잠금이 일어난다.
	public synchronized void use() throws Exception {
		
		String name =Thread.currentThread().getName();
		
		//누군가가 화장실에 들어왔을때
		//if(this.seat == false) {
		System.out.println(name + " 가/이 화장실에 들어왔다.");
		
		
		Thread.sleep(1000);
		System.out.println(name + " 아따 시원하다잉");
		
		//this.seat =false;
		System.out.println(name + " 가 화장실에서 나갔습니다");
		System.out.println();
	//	}
		//else {
		//	System.out.println(name + "가/이 화장실 사용중입니다");
		//}//싱크로나이즈드를 할경우 의미없는 데이터가 되어버린다
	}
	public void knock() {
		System.out.println(Thread.currentThread().getName() + "똑똑");
	}

}
