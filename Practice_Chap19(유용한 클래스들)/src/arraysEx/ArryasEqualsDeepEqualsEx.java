package arraysEx;

import java.util.Arrays;
import java.util.Objects;

class Car{
	String model;

	public Car(String model) {
		super();
		this.model = model;
	}
	@Override
	public String toString() {
		return this.model;
	}
}


public class ArryasEqualsDeepEqualsEx {

	public static void main(String[] args) {
		
		int[] ori = new int[] {1,2};
		int[] cloned = Arrays.copyOf(ori, ori.length);
		//얕은비교(1차원 배열은 값까지 비교
		//Arrays = 값비교
		//objects = 주소비교
		System.out.println(Arrays.equals(ori, cloned));
		System.out.println(Objects.equals(ori, cloned));
		System.out.println(ori);
		System.out.println(cloned);
		System.out.println();
		
		Car[] c1 = new Car[2];
		c1[0] = new Car("그랜져");
		c1[1] = new Car("포터");
		
		Car[] c2 = Arrays.copyOf(c1, c1.length);
		System.out.println(Arrays.equals(c1, c2));
		System.out.println(Objects.equals(c1,c2));
		System.out.println(c1);
		System.out.println(c2);
		System.out.println();
		//2차원 배열 생성
		int[][]  original = new int[][] {
			{1,2},{3,4}};
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println(Arrays.equals(original, cloned1));
		System.out.println(Arrays.deepEquals(original, cloned1));
		//System.out.println(Objects.equals(original,cloned1));
		System.out.println("original[0] : " + original[0]);
		System.out.println("cloned[0] : " + cloned1[0]);
		System.out.println(original);
		System.out.println(cloned1);
		cloned1[0][0] = 10;
		System.out.println(Arrays.deepEquals(original, cloned1));
		System.out.println(original[0][0]);
		System.out.println(cloned1[0][0]);
		
		//같은 객체를 참조하고 있기때문에 서로 영향을 미친당
		
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0],original[0].length );
		cloned2[1] = Arrays.copyOf(original[1],original[1].length );
		System.out.println(Arrays.equals(original, cloned2));
		System.out.println(Arrays.deepEquals(original, cloned2));
		System.out.println("original[0] : " + original[0]);
		System.out.println("cloned2[0] : " + cloned2[0]);
		System.out.println(original);
		System.out.println(cloned2);
		cloned2[0][0] = 50;
		System.out.println(Arrays.equals(original, cloned2));
		System.out.println(Arrays.deepEquals(original, cloned2));
		
		
		
	}

}
