package test;

public class Account {
	private int balance;
	
	final private int MIN_BALANCE = 0;
	
	final private int MAX_BALANCE = 1000000;
	
	public void setBalance(int balance) {
		if(balance>=MIN_BALANCE && balance<=MAX_BALANCE) {
			this.balance = balance;
		} else {
			balance = 0;
		}
	
	}
	public int getBalance(){
		return balance;
	}
		
}
