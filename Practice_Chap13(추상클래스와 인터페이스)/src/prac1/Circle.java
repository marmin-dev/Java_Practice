package prac1;

public class Circle extends Figure{
	
	

	@Override
	double getround(int a, int b) {
		b=a;
		return 2*PI*a;
	}

	@Override
	double getarea(int a, int b) {
		a=b;
		return (a*b)*PI;
	}

}
