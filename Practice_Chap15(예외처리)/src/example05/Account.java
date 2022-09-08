package example05;

public class Account {
	private long bal;
	public Account() {
	}
	public long getBal()	{
		return this.bal;
	}
	public void deposit(int money) {
		this.bal += money;
	}
	public void withdraw(int money) throws BalException {
		if(this.bal<money) {
			throw new BalException("잔액 부족");
		}
		this.bal -= money;
	}
}
