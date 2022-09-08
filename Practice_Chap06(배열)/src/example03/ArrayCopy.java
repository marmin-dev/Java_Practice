package example03;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] ori = new int[] {10, 77, 33, 50};
		int[] target = new int[10];
		int count =0;
		System.out.println("복사하기 전");
		System.out.println(Arrays.toString(ori));
		System.out.println(Arrays.toString(target));
		//직접 복사하는 방법
//		for(int i : ori) {
//			target[count++] = i;
//		}
//		for(int i =0;i<ori.length;i++)
//		{
//			target[i]=ori[i];
//		}
		//System.arraycopy(ori,0 , target,5, ori.length);
		//system클래스의 어레이 복사가 가장빠르다.
		target=Arrays.copyOf(ori, ori.length);
		//Arrays 의 copyof 메서드는 완전히 복사될 배열과 동일하게 복사를 해버리
		//는 배열복사 메서드이다
		System.out.println("복사한 후");
		System.out.println(Arrays.toString(ori));
		System.out.println(Arrays.toString(target));
		System.out.println(target.length);
	}

}
