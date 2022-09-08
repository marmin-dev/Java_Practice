package example03;


public class Search8 {

	public static void main(String[] args) {
		int total = 0;
		
		for(int i =1; i<10000;i++) {
			
			String str = String.valueOf(i);
			if(str.contains("8")) {
				for(int j=0;j<str.length();j++)
				{
					if('8'==str.charAt(j)) {
						total++;
					}
				}
			}
		}
		System.out.println(total);
		
		

	}
	
}
