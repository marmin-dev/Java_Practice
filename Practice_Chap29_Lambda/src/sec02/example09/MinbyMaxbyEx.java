package sec02.example09;

import java.util.function.BinaryOperator;

public class MinbyMaxbyEx {

	public static void main(String[] args) {
		
		BinaryOperator<Fruit> binaryOperator = null;
		Fruit fruit = null;
		
		//minby()스태틱 메서드는 두개의 객체를 가지고 작은쪽으로 객체를 리턴한다
		//그 기준이 되는 필드의 사용은 프로그래머의 몫이다
		//아울러, minBysms Comparator의 인터페이스 타입을 매개변수로 가지고있기 때문에
		//추상메서드인 int compare 재정의하는 람다식이 올수가있다
		binaryOperator = BinaryOperator.minBy((f1,f2)->{
//			if(f1.getPrice() < f2.getPrice()) {
//				return-1;
//			}
//			else if(f1.getPrice() == f2.getPrice()){
//				return 0;
//			}
//			else
//				return 1;
		return	Integer.compare(f1.getPrice(), f2.getPrice());
		});
		
		fruit = binaryOperator.apply(new Fruit("두리안", 5000),new Fruit("파인애플", 6000));
		System.out.println(fruit.getName());
		
		binaryOperator = BinaryOperator.maxBy((f1,f2)->{
//			if(f1.getPrice() > f2.getPrice()) {
//				return-1;
//			}
//			else if(f1.getPrice() == f2.getPrice()){
//				return 0;
//			}
//			else
//				return 1;
		return	Integer.compare(f1.getPrice(), f2.getPrice());
		});
		fruit = binaryOperator.apply(new Fruit("두리안", 5000),new Fruit("파인애플", 6000));
		System.out.println(fruit.getName());
	}

}
