package bankapplication;

import java.util.Scanner;

public class BankApplication {
//배열 100개 정적멤버로 되어있고,배열이므로 한계가 있다.(메모리 낭비가될수있고,정적이다)
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성| 2.계좌목록|3.예금하기|4.출금하기|5.종료하기");
			System.out.println("--------------------------------------------");
			System.out.println("선택 >");
			
			int choice=sc.nextInt();
			
			if(choice ==1) {
				createAccount();
			}
			else if(choice ==2) {
				accountList();
			}
			else if(choice ==3) {
				deposit();
			}
			else if(choice ==4) {
				withdraw();
			}
			else if(choice ==5) {
				System.out.println("계좌 관리 프로그램을 종료합니다.");
				run = false;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		
	}
	public static void createAccount() {
		System.out.println("----------------------");
		System.out.println("계좌를 생성합니다");
		System.out.println("----------------------");
		
		System.out.println("계좌 번호 : ");
		//next메서드는 공백에서 거기까지만 인식한다 nextline 은 엔터를 칠때까지 입력받는다.
		//그러므로 넥스트는 단어를 입력받을때 넥스트 라인은 문장을 입력받을떄 유리하다.
		String ano = sc.next();
		System.out.println("계좌 주 : ");
		String owner = sc.next();
		System.out.println("초기 입금액 : ");
		int balance = sc.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i=0; i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=newAccount;
				System.out.println("계좌 생성 완료되었습니다");
				System.out.println(accountArray[i].getAno()+accountArray[i].getOwner()
				+accountArray[i].getBalance());
				break;
			}
		}
	
	}
	
	//계좌목록 출력하기
	public static void accountList() {
		System.out.println("---------------");
		System.out.println("계좌목록을 출력합니다");
		System.out.println("----------------");
		
		for(int i=0;i<accountArray.length;i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print("\t");
				System.out.print(account.getOwner());
				System.out.print("\t");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}
	//원하는 계좌에 입금하기
	public static void deposit() {
		System.out.println("---------------");
		System.out.println("예금을 합니다.");
		System.out.println("----------------");
		
		System.out.print("계좌 번호 입력 : ");
		String ano = sc.next();
		System.out.println("예금액 : ");
		int money = sc.nextInt();
		
		Account account = findAccount(ano);
		if(account ==null) {
			System.out.println("결과 : 계좌가 없습니다. 확인 바랍니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과 : 예금이 성공했습니다. 현재잔액 : " + account.getBalance());
	}
	//계좌 찾
	public static Account findAccount(String ano) {
		Account account = null;
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] != null) {
				if(accountArray[i].getAno().equals(ano))
				{
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
	//출금하
	public static void withdraw() {
		System.out.println("---------------");
		System.out.println("출금을 합니다.");
		System.out.println("----------------");
		
		System.out.print("계좌 번호 입력 : ");
		String ano = sc.next();
		System.out.println("출금액 : ");
		int money = sc.nextInt();
		
		Account account = findAccount(ano);
		if(account ==null) {
			System.out.println("결과 : 계좌가 없습니다. 확인 바랍니다.");
			return;
		}	
		account.setBalance(account.getBalance()-money);
		System.out.println("결과 : 출금이 성공했습니다. 현재잔액 : " + account.getBalance());
}
	}


