package Basic3;

import java.util.Arrays;

public class CopyarrEx {
	
	static public void main(String[] args) {
		
	 String[] folderA = {"aaaa","bbbb","cccc"};
	 System.out.println("Call method clone()");
	 
	 String[] folderB = folderA.clone();
	 
	 System.out.println("folder A : "+Arrays.toString(folderA));
	 System.out.println("folder B : "+Arrays.toString(folderB));
	 
	 System.out.println("Call method arraycopy");
	 
	 String[] folderC =new String[folderA.length];
	 System.arraycopy(folderA, 0, folderC, 0, 2 );
	 System.out.println("folder A : "+Arrays.toString(folderA));
	 System.out.println("folder C : "+Arrays.toString(folderC));
	 
	 System.out.println("Call method copyof");
	 String[] folderD = Arrays.copyOf(folderA, 3);
	 System.out.println("folder D : "+Arrays.toString(folderD));
	 
	 String[] folderE = Arrays.copyOfRange(folderD, 1, 3);
	 System.out.println("folder E : "+Arrays.toString(folderE));
	}
	
}
