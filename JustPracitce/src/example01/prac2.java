package example01;

public class prac2 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		for(int i= 0;i<10;i++)
		{
			arr[i]= i+1;
			sum+=arr[i];
		}
		for(int i= 0;i<10;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println(sum);
	}

}
