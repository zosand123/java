package ch06_oop;

public class Car05 {
	
	//field - 접근제한자 속성 이름;
	int gas;
	
	//constructor - 접근제한자 클래스이름(매개변수리스트){}

	//method - 접근제한자 속성 리턴유형 메소드명(매개변수리스트){}
	void setGas(int gas) { //가스충전기능
		this.gas=gas;
	} 
	
	boolean isGasCheck() {
		if(gas==0){
			System.out.println("no gas left");
			return false;
		}
		System.out.println("hay gas");
		return true;
	}
	
	void run() { //달려라기능
		while(true) {
			if(gas>0) {
				System.out.println("runs "+"left gas:"+gas);	
				gas-=10;
			}else { 
				System.out.println("stops. "+"left gas:"+gas);
				 	//break;- 가능하지만 밑에 코드있으면 밑으로 내려감 
				return; //깔끔하게종료, void로 선언된 리턴값이 없는 메소드에서도 리턴사용가능
			}
		}
	}
}
