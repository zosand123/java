package ch07_oop2;

public class Cellphone01 {
	//field
	String model;
	String color;
	
	//constructor
	
	//method
	void powerOn() {System.out.println("전원켜기");}
	void powerOff() {System.out.println("전원끄기");}
	void bell() {System.out.println("Bell Ringing");}
	void sendMessage(String msg) {System.out.println("나:"+msg);}
	void receiveMessage(String msg) {System.out.println("상대방:"+msg);}
	void hangUp() {System.out.println("전화끊기");}
}
