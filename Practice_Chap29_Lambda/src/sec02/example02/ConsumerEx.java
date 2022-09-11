package sec02.example02;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		
		//String 타입을 매개변수로 가지는 컨슈머 제네릭 함수적 인터페이스 구현
		//T는 무조건 스트링 타입이고 매개변수가 된다
		//컨슈머 인터페이스들은 리턴값이 존재하지 않는 것을 상기하도록 하자
		//람다식으로 구현했다
		Consumer<String> consumer = (t)->{
			System.out.println("Consumer interface : " + t);
		};
		consumer.accept("I'm a fxxking nerd~");
		
		//Bi(2개)consumer 는 2개의 객체를 받아서 소비하는 인터페이스이다
		BiConsumer<String, String> biConsumer = (t,u) ->{
			System.out.println("Consumer interface : " + t +","+u);
		};
		biConsumer.accept("나는야", "퉁퉁이");
		
		//DoubleConsumer는 매개변수값으로 더블값만 받는 인터페이스이다
		DoubleConsumer doubleConsumer = d->{
			System.out.println("Double Consumer interface : " + d);
		};
		doubleConsumer.accept(1.80);
		
		ObjIntConsumer<String> objIntConsumer = (t,i)->{
			System.out.println("ObjIntConsumer" + t + i);
		};
		objIntConsumer.accept("자바", 8);
	}

}
