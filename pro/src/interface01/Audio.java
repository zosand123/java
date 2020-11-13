package interface01;

public class Audio implements RemoteControl {
	private int volume;
	private boolean mute;//디폴트메서드 오버라이드하면서 사용하게되는 필드를 선언
	
	@Override //실체메서드
	public void turnOn() {System.out.println("오디오의 전원을 켭니다");}

	@Override //실체메서드
	public void turnOff() {System.out.println("오디오의 전원을 끕니다");}

	@Override //실체메서드
	public void setVolume(int vol) {
		if(vol<MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		}else if(vol>MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}else { //정상범주인 경우
			this.volume = vol;
		}
		System.out.println("현재 오디오의 볼륨은 "+this.volume+"입니다.");
	}
	
	//디폴트메서드는 인터페이스의 모든 구현객체가 가지고있는 기본메소드
	//->오버라이딩안해도 사용가능,필요시오버라이딩
	@Override
	public void setMute(boolean mute) {
		//RemoteControl.super.setMute(mute);
		//인터페이스는 여러개 상속가능해서 super앞에 인터페이스이름붙음
		
		this.mute=mute; //이객체의 mute필드의 값을 변경
		if(mute) { //mute가 true일때
			System.out.println("Audio를 무음처리합니다.");
		}else {
			System.out.println("Audio의 음소거를 해제합니다.");
		}
	}
	
}
