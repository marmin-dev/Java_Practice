package Basic1;

import java.util.Arrays;

public class exam2 {
	static public void main(String[] args) {
		int[] Studentnum = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Student Number Before Sort : " + Arrays.toString(Studentnum));
		int[] Studentnum2 = new int[10];
		for(int i=0;i<Studentnum.length;i++) {
			Studentnum2[i]=Studentnum[9-i];
		}
		System.out.println("Student Number After Sort : " + Arrays.toString(Studentnum2));
		
	}

}
