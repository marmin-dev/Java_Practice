package example05;

public class PolyArgumentEx {

	public static void main(String[] args) {
		//필드의 다형성
		Product p1 = new TV();
		Product p2 = new Computer();
		Product p3 = new Audio();
		//Product[] pArray = new Product[10];
		
		
		
		
		
		Buyer buyer = new Buyer();
		
		buyer.buy(new TV());
		buyer.buy(new Audio());
		//buyer.buy(new Apple()); //왜 컴파일 예외가 발생하는가?
		//product 에 상속을 받지 않기때문에 문제가 발생하는것이다 
		
		
		
		
		
		System.out.println("현재 남은 돈: "+ buyer.money +"만원입니다.");
		System.out.println("현재 보너스 포인트: "+ buyer.bonusPoint +"점입니다.");
		
		
		
	}
}
