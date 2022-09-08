package Basic3;

public class exam02 {

	public static void main(String[] args) {
		
		int[] arr = {10,11,2,5,3,3,24,15,6,9};
		int min = arr[1];
		int max = arr[1];
		for(int i = 0 ; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

}
