package example01;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		//int[] score;스택이라는 공간에 이름만 생긴것
		int[] score = null;
		//score 은 참조변수이다 int[]이다
		//score = {100,29}; 방없는데 데이터만드는 신택스 에러
		score = new int[5];//5개의 인트방을 힙데이터에 만듬
		//score 은 5개의 방을 힙에다가 생성하고 있다.20바이트 생성
		//배열명이 곧 주소다
		System.out.println("score의 주소값 : " + score);
		for(int i=0;i < score.length;i++)
		{
			System.out.println("score" + i +score[i]);
		}
		
		score[0] = 100;//변수와 같은 역할
		for(int i=0;i < score.length;i++)
		{
			System.out.println("score" + i +score[i]);
		}
		//score 은 주소고 바은 곧 변수와 같
		//대괄호안에 들어가는 숫자를 곧 인덱스 첨자라 한다.
		for(int i=0;i < score.length;i++)
		{
			score[i] = i + 10;
		}
		for(int i=0;i < score.length;i++)
		{
			System.out.println("score" + i +score[i]);
		}//배열의 각각의 방에 있는 값을 출력하는 형태
	}

}
