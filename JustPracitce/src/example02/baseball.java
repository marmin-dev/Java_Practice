package example02;

import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in); //스캐너 메서드 선언
	int[] answer = {0,0,0}; //컴퓨터가 랜덤숫자를 받을 배열
	int[] userIn= {0,0,0}; //유저가 입력받은 배열을 설정
	int cnt = 0; //카운트 몇번만에 답을 맞췄는지?
	while(true)//서로다른 3자리 값을 받게하도록 하는 입력코드
	{
		answer[0]=(int)(Math.random()*8)+1;
		answer[1]=(int)(Math.random()*8)+1;
		answer[2]=(int)(Math.random()*8)+1;
		if((answer[0]==answer[1])||(answer[0] == answer[2])||(answer[1]==answer[2]))
		{
			continue;
		}
		else {
			break;
		}
	}
while((answer[0]!=userIn[0])||(answer[1]!=userIn[1])||(answer[2]!=userIn[2])) {
	int strike=0;
	int ball=0;
	
	try {//9이하의 양의정수만 입력받을 코드
		System.out.print("숫자>> 3개를 하나씩 입력해주세요 : ");
		userIn[0]=sc.nextInt();
		userIn[1]=sc.nextInt();
		userIn[2]=sc.nextInt();
		
		boolean ep0 = (userIn[0]>=10 ||userIn[0]<=0);
		boolean ep1 = (userIn[1]>=10 ||userIn[1]<=0);
		boolean ep2 = (userIn[2]>=10 ||userIn[2]<=0);
		if(ep0 || ep1 || ep2) {
			continue;
		}
	}catch(Exception e){
		System.err.println("잘못된 입력입니다 다시 입력하여 주세요.");
		continue;
	}
	cnt++;
	for(int i=0;i<userIn.length;i++)
	{
		if(userIn[i]==answer[i]) {
			strike ++;
		}else {
			if(i==0) {
				if(userIn[0]==answer[1]||userIn[0]==answer[2])
				{
					ball ++;
				}
				else if(userIn[1]==answer[0]||userIn[1]==answer[2])
				{
					ball ++;
				}
				else if(userIn[2]==answer[0]||userIn[2]==answer[1])
				{
					ball ++;
				}
			}
		}
	}
	System.out.printf("%dS%dB\n",strike,ball);
}
System.out.printf("축하합니다 %d번 만에 답을 맞추셨습니다.",cnt);
sc.close();
	
		
		
		
	}

}
