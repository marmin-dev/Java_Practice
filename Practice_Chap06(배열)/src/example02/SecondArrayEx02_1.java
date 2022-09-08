package example02;

public class SecondArrayEx02_1 {

	public static void main(String[] args) {
		int[][] score = new int[][] {
										{100,70,50},
										{70,60,30},
										{55,85,77},
										{100,80,75}
									};
	//과목별 총점
	int korTotal = 0; //국어
	int engTotal = 0; //영어
	int mathTotal=0; //수학
	
	int totalsum = 0;
	double avg = 0.0;
	
	System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
	System.out.println("====================================");
	
	for(int i=0;i<score.length;i++)
	{
		int sum =0;//개인별총점을 나타냄
		double avg1=0.0;//개인별 평균을 나타냄
		korTotal += score[i][0];
		engTotal += score[i][1];
		mathTotal += score[i][2];
		System.out.print(  (i+1));
		for(int j=0; j<score[i].length;j++)
		{
			sum+=score[i][j];
			System.out.print("\t"+score[i][j]);
		}
		totalsum +=sum; //총합계
		avg = sum / score[i].length;//개인별 평균
		avg +=avg1;
		System.out.print("\t"+sum+"\t"+avg);
		System.out.println();
	}//printf 메서드는 형식지정자를 써서 한다 뭐 잘알겠지만..
	
	
	}

}
