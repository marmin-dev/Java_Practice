package Basic1;

public class SortEx {

	public static void main(String[] args) {
		int arr[] = {3,1,9,5,10};
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>=arr[i])
			{
				min = arr[i];
			}
		}
			System.out.println(min);

	}

}
