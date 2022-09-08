package example01;

//상속을 하는 이유
//1.공통된 코드는 조상에서 관리한다
//2.개별적인 부분은 자손에서 따로 관리한다
//3.코드의 재생성

//상속은 직접적 관계
public class MountainBicycle extends Bicycle{
//멤버개수는 몇개일까?
	String frame;
	int gear;
	String price;
	String sector;
	
	public void print() {
		System.out.println("id값 : " + this.id);
		System.out.println("brand : " + this.brand);
		System.out.println("frame : " + this.frame);
		System.out.println("gear : " + this.gear);
		System.out.println("price : " + this.price);
		System.out.println("price : " + this.owner);
	}
	public static void main(String [] args) {
		MountainBicycle mtb = new MountainBicycle();
		mtb.id = 1111;
		mtb.brand = "LESPO";
		mtb.frame = "alloy";
		mtb.gear=33;
		mtb.price="100.000";
		mtb.owner="홍길동";
		mtb.print();
	}
	
}
