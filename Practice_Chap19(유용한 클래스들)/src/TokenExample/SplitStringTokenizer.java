package TokenExample;

import java.util.StringTokenizer;

public class SplitStringTokenizer {

	public static void main(String[] args) {
		
		String data = "baby cat dog a b c d e f g h";
		
		long start = System.nanoTime();
		
		//split메서드는 구분자를 공백으로 주면 데이터가 공백을 다수 포함하고 있다면,
		//공백도 하나의 토큰으로 인식한다
		String[] result = data.split(" ");
		for(String str : result) {
			System.out.println(str);
		}
		long end = System.nanoTime();
		System.out.println(end - start);
		//StringTokenizer은 구분자를 공백으로 주면 데이터가 공백을 다수 포함하고 있다면
		//공백은 토큰으로 인정하지 않는다
		System.out.println();
		StringTokenizer sTokenizer = new StringTokenizer(data," ");
		
		while(sTokenizer.hasMoreTokens()) {
			System.out.println(sTokenizer.countTokens());
			String str = sTokenizer.nextToken();
			System.out.println(str);
		}

	}

}
