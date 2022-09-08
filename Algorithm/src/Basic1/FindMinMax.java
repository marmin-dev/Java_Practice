package Basic1;

public class FindMinMax {

	public static void main(String[] args) {
		final int MAX_LEN = 100;
		int[] arr = new int[MAX_LEN];
		for(int i=0;i<MAX_LEN;i++) {
			arr[i]=(int)(Math.random()*98)+1;
		}
		int min = arr[0];
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Max = "+ max + "Min = " + min );
		

	}

}
