package example05;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(50000);
		System.out.println(account.getBal());
		try {
			account.withdraw(40000);
			account.withdraw(20000);
		} catch (BalException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(account.getBal());
		
	}

}
