package interface01;
//1028-11 인터페이스 RemoteControl의 구현클래스들을 실행하는 클래스
/*인터페이스 구현객체 사용법
 * 인터페이스 변수;
 * 변수 = 구현객체;
 * 
 */
public class RemoteControl_Ex {
	public static void main(String[] args) {
		RemoteControl rc;	//인터페이스 변수;
		rc = new Tv();		//변수 = 구현객체; =>tv객체를 인터페이스타입에 대입
		
		//인터페이스의 turnOn()과 turnOff()를 호출
		//실제적인 구현은 실체클래스 tv의 실체메서드가 호출실행
		rc.turnOn(); //Tv의 전원을 켭니다
		rc.setVolume(-7);
		rc.turnOff(); //Tv의 전원을 끕니다
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(3);
		rc.turnOff();
		
		System.out.println();
		
		//인터페이스에서 정의된 정적메서드사용
		RemoteControl.changeBattery();
		
		//디폴트메서드사용
		rc.setMute(true);
	}

}
