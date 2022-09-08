package example03;

public class CarEx {

	public static void main(String[] args) {
		
		Car car = null;
		SportCar sc = new SportCar();
		SportCar sc2 = null;
		PoliceCar pc = new PoliceCar();
		
		sc.speedUp();
		
		car = sc; //업캐스팅(자손->조상),조작할수있는 멤버가 줄어든다.
		//car.speedUp();예외가 발생한다 
		sc2=(SportCar)car; //다운캐스팅 (조상->자손)조작가능한 멤버가 늘어난다.
		sc2.speedUp(); //다운 캐스팅을 통해 근본을 바꾸었기 때문이다.
		//아래코드는 서로 상속관계가 아니기 때문에 형변환이 절대 이루어질수없다.
		//sc1 = (SportCar)pc; 상속관계에서만 허용된다.
		//자기 근본에 벗어나지 않는한에서 형변환이 가능하다.
		
	}

}
