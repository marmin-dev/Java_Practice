package example03;

public class MyVectorEx {

	public static void main(String[] args) {
		
		MyVector mv = new MyVector();
		System.out.println("용량수 : " + mv.capacity());
		
		mv.add("2000");
		mv.add("20");
		mv.add("-15");
		mv.add("김개똥");
		mv.add("7.5");
		System.out.println(mv.get(1));
		System.out.println("삭제전 : "+mv.toString());
		System.out.println("객체수 : "+mv.size());
		
		mv.remove("2000");
		mv.remove("김개똥");
		System.out.println("객체수 : "+mv.size());
		
		mv.clear();
		System.out.println("객체수 : "+mv.size());
	}

}
