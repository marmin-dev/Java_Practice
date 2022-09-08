package example01;

public class SenderEx {

	public static void main(String[] args) {
		//추상클래스이니 절대 인스턴스를 생성이 불가능하다.
		//ContentSender contentsender =new ContentSender() {
		//추상클래스도 조상으로 필드의 다형성이 적용됨
		ContentSender contentsender1 = new KakaoSender("카카오톡", "홍길동", "안뇽안뇽");
		contentsender1 .sendMessage("김연아");
		System.out.println();
		ContentSender contentsender2 = new SmsSender("sms", "공유", "사랑");
		contentsender2.sendMessage("김길환");
			
		
			
		

	}

}
