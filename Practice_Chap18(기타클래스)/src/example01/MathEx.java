package example01;

public class MathEx {

	public static void main(String[] args) {
		//절대값
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-7.8);
		System.out.println(v1);
		System.out.println(v2);
		//올림값
		double v3 = Math.ceil(5.3);
		System.out.println(v3);
		//내림값
		double v4 = Math.floor(5.9);
		System.out.println(v4);
		//둘중 최대값
		int v5 = Math.max(10, 12);
		System.out.println(v5);
		//둘중 최소값
		int v6 = Math.min(8, 12);
		System.out.println(v6);
		//랜덤값
		double v7 = Math.random();
		System.out.println(v7);
		//가까운 정수의 실수값
		double v8 =Math.rint(5.6);
		System.out.println(v8);
		//반올림값
		double v9=Math.round(5.37545);
		System.out.println(v9);
		//소수점 셋쨰자리에서 반올림하는값
		double value = 12.3456;
		double temp1 = value * 100;
		System.out.println(temp1);
		long temp2 = Math.round(temp1);
		System.out.println(temp2);
		double v10 = temp2/100.0;
		System.out.println(v10);
	}

}
