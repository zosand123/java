package ch08_Exceptions;

public class Account {
	//잔고
	private long balance;
	//생성자
	public Account(){}
	
	//잔고조회
	public long getBalance() {
		return balance;
	}	
	//입금 
	public void deposit(long money) {
		balance+=money;
	}
	
	//출금 
	public void withdraw(long money) throws BalanceInsufficientException { //사용자정의예외 떠넘기기
		if(balance<money) {
			//사용자정의 예외 발생시키기 
			throw new BalanceInsufficientException("잔고부족 : "+(money-balance)+" 모자랍니다"); 
		}else {
			balance-=money;
		}
	}
}
