package interface01;
//1028-5 추상클래스animal을 상속받는 실체 클래스
public class Puppy extends Animal{
	
	public Puppy() {
		this.type = "포유류";
	}
	//추상클래스에서 미구현된 추상메서드를
	//실체에서는 반드시 오버라이딩하여 구현해야한다
	@Override
	public void move() {
		System.out.println("네발로 뛰어다녀요");
	}

	@Override
	public void sound() {
		System.out.println("멍멍하고 짖어요 ");
	}

}
