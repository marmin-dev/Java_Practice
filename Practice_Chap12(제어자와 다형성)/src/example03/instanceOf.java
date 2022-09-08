package example03;

public class instanceOf {

	public static void main(String[] args) {
		
		SportCar sportcar = new SportCar();
		//cmd + t 는 상속계층도를 볼수있는 단축키이다.
		if(sportcar instanceof SportCar) {
			System.out.println("SportCar 로 형변환이 가능합니다.");
		}
		if(sportcar instanceof Car) {
			System.out.println("Car 로 형변환이 가능합니다.");
		}
		if(sportcar instanceof Object) {
			System.out.println("Object 로 형변환이 가능합니다.");
		}
		
		//instanceof 연산자의 결과가 true라는 것은 실제 형변환이 가능하다 라는 것을
		//의미하며 , 아울러 상속관계에 있는것이다.

	}

}
