package ch07_oop2;

public class DMBcellphone extends Cellphone01 {
	 //이클래스는 상속받은 필드와 메소드 이미존재
	int channel = 17;
	DMBcellphone(String model,String color,int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 방송중");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 "+channel+"로 변경");
	}
	void turnOffDmb() {
		System.out.println("방송종료");
	}
}
