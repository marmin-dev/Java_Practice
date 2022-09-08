package objectsExample;

public class HashEx {

	public static void main(String[] args) {
		
		Person person1 = new Person(30,"홍길동",new int[] {176,68});
		Person person2 = new Person(30,"홍길동",new int[] {176,68});
		int[]arr1 =new int[] {178,86};
		int[]arr3 = {178,86};
		int[]arr4 = {178,86};
		int[]arr2 =new int[] {178,86};
		
		//배열의 해쉬코드가 다른 이유는  new 라는 연산자 때문이다
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		System.out.println(arr3.hashCode());
		System.out.println(arr4.hashCode());
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());

	}

}
