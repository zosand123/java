package interface01;
//1028-1 추상클래스
public abstract class Phone {
	
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//추상메서드 : body가 없음
	//public abstract void a();
	
	//추상클래스는 일반 method를 가질 수 있다
	public void turnOn() {
		System.out.println("Phone turned on");
	}
	public void turnOff() {
		System.out.println("Phone turned off");
	}
}
