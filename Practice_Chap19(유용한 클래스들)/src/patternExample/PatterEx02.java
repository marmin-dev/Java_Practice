package patternExample;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterEx02 {

	public static void main(String[] args) {
		
		String[] data = {"bat","baby","bonus","ca","cb","c++","car",
				"com","date","zoo","disc"};
		//소문자 c로 시작하는 영어단어나 문자를 패턴으로 정의
		String pattern = "b[a-z]*";
		Vector<String> vStrings = new Vector<String>();
		
		for(String str : data) {
			boolean result = Pattern.matches(pattern, str);	
//			Matcher matcher = pattern.matcher(str);
//			//정의패턴과 일치하는가?
			if(result) {
				System.out.print(str + ",");
				vStrings.add(str);
			}
		}
		System.out.println();
		System.out.println("c로시작하는 소문자 영단어 : "+vStrings.toString());

	}

}
