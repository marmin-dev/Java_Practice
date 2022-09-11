package exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class WordSearch {

	public static void main(String[] args) {
		//단어찾기 프로그램 문제
		
		//단어를 저장할 곳을 만들어야함
		Vector<String> vector = new Vector<>();
		File file = new File("/Users/marmin/eclipse-workspace/Practice_Chap26(IO기반의 입출력2)/src/exercise/word.txt");
		System.out.println(file.length());
		
		try {
			Scanner fscan = new Scanner(file);
			while(fscan.hasNext()) {
				vector.add(fscan.next());	//공백을 포함하지 않고 이전까지 저장
			}
			fscan.close();
		} catch (FileNotFoundException e) {}
		
		System.out.println("vector에 저장된 단어들 출력");
		
		for(int i=0; i<vector.size();i++) {
			System.out.println(vector.get(i));
		}
		
		//단어 검색하기
		Scanner sc = new Scanner(System.in);
		while(true) {
			boolean found = false; //flag변수
			System.out.println("찾을 단어 입력>>(종료는 exit)");
			String search = sc.next();
			
			if(search.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
		
			for(int i=0;i<vector.size();i++) {
				String vs = vector.get(i); //벡터내 문자열 가져오기
				if(search.equals(vs)) {
					System.out.println("찾은 문자 : " +vs);
					System.out.printf("찾은 문자는 %d 열에 있습니다", i+1);
					found =true;
				} 
			}
			if(!found) {
				System.out.println("찾는 단어가 없습니다");
			}
			
			
			
		}
		
		sc.close();
	}

}
