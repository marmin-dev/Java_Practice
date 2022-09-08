package example01;

import java.util.Scanner;

public class prac1 {

	public static void main(String[] args) {
//내가 푼답안
//		Scanner sc = new Scanner(System.in);
//		System.out.println("거리를 입력하세요 m단위 입력할것");
//		int meter = sc.nextInt();
//		double km = 0;
//		km = (double) meter/1000;
//		System.out.println(meter +"은 " + km + "km입니다.");
//		sc.close();
		//레퍼런스
		Scanner sc = new Scanner(System.in);
		
		System.out.println("거리를 입력하세요 : ");
		int i =Integer.parseInt(sc.nextLine());
		int k =0;
		if(i<1000)
		{
		System.out.print(i+"m");
		}
		else {
			k=i/1000;
			System.out.print(k+"km");
		}
		sc.close();

	}

}
