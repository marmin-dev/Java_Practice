package sec02.example03;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {
		
		//Supplier<T> 함수적 인터페이스는 매개값이 없고, T타입의 값을 리턴해준다
		//하여 아래와 같이 함수적인터페이스의 추상메서드인 get()을 람다식을 제공해줬으며
		//또한 호출도 한 결과이다
		Supplier<String> supplier = ()->{
			String str = "Learning about java";
			return str;
		};
		String str = supplier.get();
		System.out.println(str);
		
		IntSupplier intSupplier = ()-> {
			int rand = (int)(Math.random()*45)+1;
			return rand;
		};
		//IntSupplier 함수적 인터페이스 역시 매개값이 없고, int타입(고정) 
		//반드시 리턴을 해야한다 getAsInt() 를 람다식으로 구현해서 호출해본 결과이다
		int rand = intSupplier.getAsInt();
		System.out.println(rand);
		
		
	}

}
