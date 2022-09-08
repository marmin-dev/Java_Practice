package example04;

public class AccountEx {

	public static void main(String[] args) {
		
		Account account =new Account();
		account.deposit(50000);
		System.out.println("현재 잔액 : " + account.getBalance());
		
		try {
			account.withdraw(10000);
			account.withdraw(50000);
			System.out.println("현재 잔액 : " + account.getBalance());
		} catch (BalanceException e) {
			System.out.println("예외원인 : "+e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("정상종료되었습니다");
		}
	}

}
