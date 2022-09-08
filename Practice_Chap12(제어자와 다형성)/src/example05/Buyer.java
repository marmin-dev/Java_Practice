package example05;

//독립클래스
public class Buyer {
	
	int money = 1000;//소유금액
	int bonusPoint=0;//보너스점수
	//아래와 같이 프로그램을 하다보면, 코드의 길이는 무한대가 될것이며,
	//아주 쓸모없는 코드로만 나오는 형태.
//	public void buy(TV tv) {
//		if(this.money < tv.price) {
//			System.out.println("잔액이 부족하여,물건 구입이 안됩니다.");
//			return;
//		}
//		this.money -=tv.price;
//		this.bonusPoint += tv.bonusPoint;
//		System.out.println(tv + "를 구매하셨습니다.");
//	}
	//여기서 매개변수 product 타입이 왔다는것은 무엇을 의미할까?
	//product 이거나 그의 자손들은 다 올수있다는 것을 의미한다.(매개변수의 다형성)
	public void buy(Product product) {
		if(this.money < product.price) {
			System.out.println("잔액이 부족하여,물건 구입이 안됩니다.");
			return;
		}
		this.money -=product.price;
		this.bonusPoint += product.bonusPoint;
		System.out.println(product + "를 구매하셨습니다.");
	}
//	public void buy(Computer com) {
//		if(this.money < com.price) {
//			System.out.println("잔액이 부족하여,물건 구입이 안됩니다.");
//			return;
//		}
//		this.money -=com.price;
//		this.bonusPoint += com.bonusPoint;
//		System.out.println(com + "를 구매하셨습니다.");
//	}

}
