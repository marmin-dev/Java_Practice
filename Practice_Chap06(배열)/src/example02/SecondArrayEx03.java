package example02;

import java.util.Scanner;

public class SecondArrayEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] student; //2차원 배열을 선언
		int count = 0, num = 0, sum=0, total =0;//반수,인원,합계,계
		double avg =0.0;
		double avgTotal =0.0;
		
		System.out.print("반수 입력:");
		count = sc.nextInt();
		student = new int[count][];//반의 개수를 1차원배열로 할당 (힙)
		
//		System.out.println("2차원 배열주소 : " + student);
//		System.out.println("1차원 배열 방 크기 : " + student.length);
		for(int i=0;i<student.length;i++)
		{
			System.out.printf("%d반의 인원 : ",i+1);
			num = sc.nextInt();
			student[i] = new int[num];//반의 인원을 입력받아라
			for(int j=0; j<student[i].length;j++)
			{
				System.out.printf("%d반의 %d번의 점수 : " , (i+1),(j+1));
				student[i][j] = sc.nextInt();//실제 반인원의 점수를 받는다.
			}
			System.out.println();
		}
		//점수가 제대로 입력되었는지 확인하는 코드
//		for(int i=0; i<student.length;i++)
//		{
//			for(int j=0;j<student[i].length;j++)
//			{
//				System.out.println(student[i][j]);
//			}
//		}
		System.out.println("반\t합계\t평균\t");
		System.out.println("--------------------------");
		
		for(int i=0; i<student.length;i++)
		{
			sum=0;
			for(int j=0; j<student[i].length;j++)
			{
				sum += student[i][j];//반별합계
			}
			total += sum;
			avg = (double)sum / student[i].length;
			avgTotal += avg; //총 평균의 합
			System.out.printf("%d반\t%d\t%.1f\n",i+1,sum,avg);
		}
		avgTotal = avgTotal / student.length;
		System.out.printf("계\t%d\t%.1f\n",total,avgTotal);
		sc.close();

	}

}
