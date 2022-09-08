package example03;

public class ProdcutEx {

	public static void main(String[] args) {
		
		Product ori =new Product("1225", "Tv", 300, new int[] {10,20});
		
		Product cloned =ori.getProduct();//얕은 복제를 한 객체를 리턴
		
		int [] arr = cloned.getArr();
		int [] arr2= ori.getArr();
		System.out.println("배열주소복제"+arr);
		System.out.println("배열주소원본"+arr2);
		arr[0]=777;
		
		System.out.println(ori);
		System.out.println();
		System.out.println(cloned);
		
		
	}

}
