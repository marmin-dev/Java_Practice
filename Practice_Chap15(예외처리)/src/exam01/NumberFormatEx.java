package exam01;

public class NumberFormatEx {

	public static void main(String[] args) {
		String str1 ="100";
		String str2 = "100ga";
		
		System.out.println(str1 + ","+str2);

		int val1=Integer.parseInt(str1);
		int val2=Integer.parseInt(str2);
		int result = val1+val2;
		System.out.println(result);
	}

}
