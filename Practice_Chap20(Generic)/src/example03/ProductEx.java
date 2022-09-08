package example03;

public class ProductEx {

	public static void main(String[] args) {
		
		Product<Tv, String> p1 = new Product<>();
		p1.setT(new Tv(2022, 8));
		p1.setM("LG OLED SMART TV");
		System.out.println("나의 tv는"+ p1.getT().getYear()+"년"
				+p1.getT().getMonth()+"월식"+p1.getM());
		System.out.println();
		
		Product<Car, String> p2 = new Product<>();
		p2.setT(new Car("현대",2015,2));
		p2.setM("벨로스터");
		Car car = p2.getT();
		String str = p2.getM();
		System.out.println("내차는"+car.getYear()+car.getMonth()+car.getBrand()+ str);
		
	}

}
