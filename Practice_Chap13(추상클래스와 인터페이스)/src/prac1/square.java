package prac1;

public class square extends Figure {

	@Override
	double getarea(int a, int b) {
		return a*b;
	}

	@Override
	double getround(int a, int b) {
		return (2*a)+(2*b);
	}

}
