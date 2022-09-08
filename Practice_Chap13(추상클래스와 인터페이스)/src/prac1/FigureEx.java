package prac1;

public class FigureEx {

	public static void main(String[] args) {
		double area=0;
		Figure f = new Circle();
		area=f.getarea(20, 20);
		System.out.println(area);
		System.out.println(f.getround(5, 5));
		System.out.println();
		f= new square();
		System.out.println(f.getarea(20, 20));
		System.out.println(f.getround(20,20));
	}

}
