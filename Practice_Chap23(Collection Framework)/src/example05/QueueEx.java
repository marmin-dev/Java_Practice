package example05;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		Queue<Message> mqueue = new LinkedList<>();
		
		mqueue.offer(new Message("sendMail","김길환"));
		mqueue.offer(new Message("sendMessenger","송길환"));
		mqueue.offer(new Message("sendKakaotalk","양길환"));
		mqueue.offer(new Message("sendSms","주길환"));
		
		while(!mqueue.isEmpty()) {
			Message message = mqueue.poll();
			System.out.println(mqueue.size());
			switch (message.getCommand()) {
			case "sendMail":
				System.out.println(message.getTo()+"에게 보낸다");
				break;
			case "sendMessenger":
				System.out.println(message.getTo()+"에게 보낸다");
				break;
			case "sendKakaotalk":
				System.out.println(message.getTo()+"에게 보낸다");
				break;
			case "sendSms":
				System.out.println(message.getTo()+"에게 보낸다");
				break;
			}
		}
	}

}
