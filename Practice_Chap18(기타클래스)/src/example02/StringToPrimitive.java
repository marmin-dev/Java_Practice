package example02;

public class StringToPrimitive {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("100");
		double value2 = Double.parseDouble("100.0");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

		String val = System.getProperty("os.name");
		System.out.println(val);
	}

}
