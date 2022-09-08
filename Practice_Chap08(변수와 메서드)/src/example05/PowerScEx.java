package example05;

import java.util.Scanner;

public class PowerScEx {
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("어떤 숫자를 입력할까요?");
	 int x = sc.nextInt();
	 System.out.println("몇 승을 할까요?");
	 int y = sc.nextInt();
	 long result = PowerScEx.pow(x,y);
	 System.out.println(x + "의 " + y + "승 = " + result);
	 
	 
	 
	 sc.close();
 }
 public static long pow(int x,int y)
 {
	 long result;
	 if(y==0){
		 result = 1;
	 }
	 else {
		 result = x * pow(x,(y-1));
	 }
	 
	 return result;
 }
}
