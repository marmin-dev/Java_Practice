package example02;

public class TVEx {

	public static void main(String[] args) {
		
		TV<String> tv = new TV<>();
		tv.setE("LG OLED TV");
		String tvName = tv.getE();
		
		System.out.println("ëě TVë"+tvName);
		
	}

}
