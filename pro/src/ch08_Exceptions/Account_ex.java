package ch08_Exceptions;

public class Account_ex {

	public static void main(String[] args) {
		Account account = new Account();
		//입금하기
		account.deposit(100000);
		//잔고확인
		System.out.println("예금 후 잔고 : "+account.getBalance());
		//출금하기
		try {
			account.withdraw(2000000000);
		} catch (BalanceInsufficientException e) {
			String msg = e.getMessage();
			System.out.println(msg);
			e.printStackTrace();
		}finally {
		}
	}

}
