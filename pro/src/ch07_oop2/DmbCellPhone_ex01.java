package ch07_oop2;

public class DmbCellPhone_ex01 {
	
	public static void main(String[] args) {
	
		DMBcellphone dmb = new DMBcellphone("iphone11","space gray",19);
		
		//상속받은 필드값
		System.out.println("model="+dmb.model);
		System.out.println("color="+dmb.color);
		
		System.out.println("channel="+dmb.channel);
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendMessage("salut");
		dmb.receiveMessage("hola");
		dmb.hangUp();
		dmb.powerOff();
		dmb.turnOnDmb();
		dmb.changeChannel(34);
		dmb.turnOffDmb();
	}
}
