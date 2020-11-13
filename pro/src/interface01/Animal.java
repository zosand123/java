package interface01;
//1028-4 추상클래스
public abstract class Animal {
	public String type;
	
	//추상 method - [public|protected] abstract 리턴유형 메소드명(매개변수리스트);
	public abstract void move();
	public abstract void sound();
	
	//일반method
	public void breath() {System.out.println("숨쉬기");}
}
