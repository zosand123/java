package testFeedback;

public class Account2 {
	//field
	//comment : 필드가 많아질 경우필드주석은 필드선언줄에 작성하는 게 좋아요
	private String accountNo;//comment : 계좌번호

	private String owner;//comment : 계좌소유자명
	//잔고
	private int balance;
	
	//constructor
	public Account2(String accountNo, String owner, int balance){
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	//setter & getter
	public String getAccountNo(){
		return accountNo;
	}
	public String getOwner(){
		return owner;
	}
	public int getBalance(){
		return balance;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	//comment :toString()는 Object클래스의 메소드를 오버라이딩하였으니
	//@Overriding으로  애너테이션을 달아주는게 좋아요
	public String toString() {//toString() method 가 호출되면 (ano+owner+balance) 이 값들을 String 문자열로 리턴
		return "계좌번호:"+accountNo+"   계좌주:"+owner+"   계좌잔액:"+balance+'\n';//이 method를 호출하면 계좌번호+소유주+잔액 표시
	}
	
}
