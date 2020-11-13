package refactoring.ex01.after;

//매직넘버를 (기호)상수로 치환
//매직넘버란? 소스코드에서 특정한 값을 가진 숫자

//리팩토링의 기준 : 매직넘버
//개선방법 : 매직넘버를 기호상수로 치환

//크루즈제어기능을 가진 클래스
class CruiseControl{
	
	private double targetSpeedKmh;
	
	//상수선언
	static final int NORMAL_PTRESET=0;
	static final int STOP_PTRESET=1;
	static final int HIGH_PTRESET=2;
	
	void setPreset(int speedPreset) {
		if(speedPreset==HIGH_PTRESET) {
			setTargetSpeedKmh(10920);
		}else if(speedPreset==STOP_PTRESET) {
			setTargetSpeedKmh(10000);
		}else if(speedPreset==NORMAL_PTRESET) {
			setTargetSpeedKmh(15000);
		}
	}
	
	void setTargetSpeedKmh(double speed) {
		targetSpeedKmh = speed;
		System.out.println(targetSpeedKmh+"으로 선 설정 완료");
	}
}

public class AfterCruiseControl {

	public static void main(String[] args) {
		CruiseControl cc = new CruiseControl();
		cc.setPreset(2);
		cc.setPreset(1);
		cc.setPreset(0);
	}
}
