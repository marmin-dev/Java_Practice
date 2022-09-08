package example01;

public class ArrayEx02 {
public static void main(String[] args) {
	int sum = 0; //총점
	double avg=0.0; //평균
	
	//int[] score = {100 , 200 , 300};
	//선언과 동시에 초기화가 일어니고 있는 코
	int[] score = new int[] {100, 90,50, 60 ,30};//권장사항
	
	System.out.println("배열의 크기 :" + score.length);
	//배열의 각 요소들을 전부 더하고 있다
	for(int i=0;i<score.length;i++)
	{
		sum +=score[i];
		
	}
	avg= sum/score.length;//배열의 총점을 구하고 있다.
	
	System.out.println("총점" + sum);
	System.out.println("평균" + avg);
	}
}
