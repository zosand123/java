package ch06_oop;

public class Car05_ex01 {

	public static void main(String[] args) {
		
		//자동차객체생성
		Car05 c5 = new Car05();
		
		//가스충전기능 실행
		c5.setGas(10);
		
		//가스충전여부 확인기능
		boolean gasState = c5.isGasCheck();
		if(gasState) {
			//달려라 기능 실행
			c5.run();
		}
		if(gasState) {
		 System.out.println("gas suiffisant");	
		}else {
			System.out.println("Need gas");
		}
		
		
	}

}
