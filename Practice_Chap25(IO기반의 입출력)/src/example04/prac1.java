package example04;

import java.io.FileReader;

public class prac1 {
	public static void main(String[] args) throws Exception {
		
		FileReader fReader = new FileReader("/Users/marmin/Documents/test.txt");
		int read;
		while((read=fReader.read())!=-1) {
			System.out.println((char)read);
		}
		
		
		
		
	}
}
