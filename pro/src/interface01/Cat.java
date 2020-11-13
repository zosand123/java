package interface01;
//1028-6 추상클래스animal을 상속받는 실체 클래스
public class Cat extends Animal{
	
	public Cat() {
		this.type = "포유류";
	}
	
	@Override
	public void move() {
		System.out.println("4발로 점프해요");
	}

	@Override
	public void sound() {
		System.out.println("야옹하고 샤우팅해요");
	}

}
