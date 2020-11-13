package ch08_Exceptions;
//이 클래스는 잔고부족예외를 처리하기위한 사용자정의 예외클래스이다.
//사용자정의예외클래스 선언 : 보험으로 사용자편의를 위해 만들어주는것이 좋다.
public class BalanceInsufficientException extends Exception {
	//field
	public BalanceInsufficientException(){}
	
	public BalanceInsufficientException(String message){
		super(message); //상위클래스의 생성자를 호출하여 예외메세지를 넘겨준다
	}
	//method
}
