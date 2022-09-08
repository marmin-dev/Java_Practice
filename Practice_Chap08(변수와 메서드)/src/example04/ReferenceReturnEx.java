package example04;

import java.util.Arrays;

public class ReferenceReturnEx {

	public static void main(String[] args) {

		int[] ori = new int[] {10,20,30,40,50};//원본배열
		int[] cloned;		//타겟배열
		System.out.println("copy()호출 전 : " + Arrays.toString(ori));
		cloned = copy(ori);
		System.out.println("cloned[]값 : " + Arrays.toString(cloned));
	}
	//리턴타입이 참조타입 온 경우
	public static int[] copy(int[] arr) {
		int[] temp = new int [5];
		//System.arraycopy(arr, 0, temp, 0, arr.length);
		for(int i = 0; i<arr.length;i++)
		{
			temp[i] = arr[i];
		}
		return temp;
		
	}

}
