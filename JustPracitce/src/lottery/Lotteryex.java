package lottery;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lotteryex {

	public static void main(String[] args) {
		Set<Integer> lottery = new TreeSet<>();
		int money , choice , chance;
		int lotteryVal=1000;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lotto 프로그램");
		System.out.println("============");
		while(true) {
			System.out.println("1.Lotto 구매");
			System.out.println("2.프로그램 종료\n"+"==========\n" +"메뉴선택 : ");
			choice = sc.nextInt();
			if(choice==1) {
			System.out.println("Lotto 구매합니다\n[로또 구매단가 1000원]\n금액입력");
			money = sc.nextInt();
			chance=money/lotteryVal;
			for(int i=0;i<chance;i++) {
				for(int k=0;k<6;k++) {
					int lotteryNum = (int)((Math.random()*45)+1);
					lottery.add(lotteryNum);
				}
				System.out.println(lottery.toString());
				lottery.clear();
			}
			System.out.println("받은 금액은 "+ money+ "이고 거스름돈은" + money%lotteryVal+ "입니다");
			}
			else if(choice ==2) {
				System.out.println("프로그램을 종료합니다");
				return;
			}
			else {
				System.out.println("1또는 2를 입력하여 주십시오");
			}
		}
		
	}
}
