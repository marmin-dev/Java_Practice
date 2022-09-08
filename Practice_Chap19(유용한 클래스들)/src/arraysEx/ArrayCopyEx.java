package arraysEx;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {10,20,30,40};
		//1.배열복사방법(copyOf)
		int[] cloned1 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr1 : " +Arrays.toString(arr1));
		System.out.println("cloned"+ Arrays.toString(cloned1));
		System.out.println();
		//2.배열복사 방법(copyOfRange)
		cloned1 = Arrays.copyOfRange(arr1, 1, 3);
 		System.out.println("arr1 : " +Arrays.toString(arr1));
		System.out.println("cloned"+ Arrays.toString(cloned1));
		System.out.println();
		//3.배열 복사 방법 (System.arraycopy)
		System.arraycopy(arr1, 0, cloned1, 0, 2);
		System.out.println("arr1 : " +Arrays.toString(arr1));
		System.out.println("cloned"+ Arrays.toString(cloned1));
		//가장 속도가 빠른것은 시스템클래스 밑의 어레이 카피가 가장 빠르다
		
	}

}
