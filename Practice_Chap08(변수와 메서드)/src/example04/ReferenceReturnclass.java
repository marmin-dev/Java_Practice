package example04;

class Data{
	int data;
}
public class ReferenceReturnclass {

	public static void main(String[] args) {
		
		Data ori = new Data();
		ori.data = 100;
		System.out.println(ori);
		Data cloned = copy(ori);
		System.out.println(ori);
		System.out.println(cloned.data);
		System.out.println();
		

	}
	public static Data copy (Data d) {
		
		Data cloned = new Data();
		cloned.data = d.data;
		System.out.println(cloned);
		return cloned; //data 클래스의 주소를 리턴값으로 넘기고 있다.
	}

}
