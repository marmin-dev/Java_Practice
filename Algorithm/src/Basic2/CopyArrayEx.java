package Basic2;

import java.util.Arrays;

public class CopyArrayEx {

	public static void main(String[] args) {
		
		String[] folderA = {"myComputer","myDocument"};
		String[] folderB = folderA;
		
		System.out.println("Original value of folderA"+Arrays.toString(folderA));
		
		folderB[0]="ohMyDearLord";
		
		System.out.println("Value of folderA after change" + Arrays.toString(folderA));
		System.out.println("Value of folderB after change" + Arrays.toString(folderB));
		//copy adress of heap data so, value of folderA and folderB is changed
	}

}
