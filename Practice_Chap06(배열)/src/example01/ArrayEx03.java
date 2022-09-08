package example01;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		//40바이트가 힙에 생성되었다.
		int[] arr1 = new int[10];
		char[] chArr = new char[] {'a' ,'b', 'c'};
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i] = (int)(Math.random() * 10)+1;
		}
		//범위 1에서 10까지의 난수
		for(int i=0; i<arr1.length; i++)
		{
			if(i==9) {
				System.out.print(arr1[i] );
			}
			else {
				System.out.print(arr1[i] + ",");
			}
			
		}
		System.out.println();
		System.out.print(Arrays.toString(arr1));
		//Array클래스는 배열을 조작하기 쉽게 만들어놓은 유틸리티 클래스
		System.out.println();
		System.out.print(Arrays.toString(chArr));
		System.out.println();
		System.out.println(chArr.toString());
		//char 타입은 주소를 출력하려면 toString()을 호출해야한다.
		
	}

}
