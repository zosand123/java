package interface01;
//1028-9 RemoteControl 인터페이스를 구현하는 클래스
/*참고
 * 개발코드가 인터페이스 메소드를 호출하면 인터페이스는 객체의 메소드를 호출
 * 객체는 인터페이스에서 정의한 추상메서드와 동일한 메소드명,매개타입,리턴타입을 가진 실체메서드를 가져야한다
 * =>이러한 객체를 인터페이스의 구현(implement)객체라 한다
 * =>구현객체를 생성하는 클래스를 구현클래스라고 한다.
 */
public class Tv implements RemoteControl{
	private int volume;
	
	@Override //실체메서드
	public void turnOn() {System.out.println("Tv의 전원을 켭니다");}

	@Override //실체메서드
	public void turnOff() {System.out.println("Tv의 전원을 끕니다");}

	@Override //실체메서드
	public void setVolume(int vol) {
		if(vol<MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		}else if(vol>MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}else { //정상범주인 경우
			this.volume = vol;
		}
		System.out.println("현재 TV의 볼륨은 "+this.volume+"입니다.");
	}

}
