package example03;

import java.util.Arrays;

public class ProductEx {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		
		
		
		System.out.println("Prodcut.number : "+Product.number+
				","+product1.countNo);
		
		System.out.println(Arrays.toString(product1.arr));
		System.out.println("Prodcut.number : "+Product.number+
				","+product2.countNo);
		System.out.println(Arrays.toString(product2.arr));
		System.out.println("Prodcut.number : "+Product.number+
				","+product3.countNo);
		System.out.println(Arrays.toString(product3.arr));
	}

}
