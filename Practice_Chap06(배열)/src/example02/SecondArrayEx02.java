package example02;

public class SecondArrayEx02 {

	public static void main(String[] args) {
		int[][] score = new int[][] {
										{100,70,50},
										{70,60,30},
										{55,85,77},
										{100,80,75}
									};
	int sum = 0;
	double avg=0.0;//평균값은	실수형으로 저장
	int varSi =0; //배열의 모든 방개수를 저장하는 변수
	
	for(int temp[]:score) {
		for(int i : temp) {//총합을 구하는 코드
			sum += i;
		
		}
		
	}
	for(int i=0;i<score.length;i++)
	{
		varSi+=score[i].length; //배열의 모든 방개수
	}
	
	
		System.out.println("점수의 총합계는" + sum + "입니다");
		avg=sum/varSi;
		System.out.println("점수의 총평균은" + avg + "입니다");
									
									
	}

}
