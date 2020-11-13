package ch07_oop2;

public class Child01 extends Parent01 {

	public void m3() {
		System.out.println("자식클래스 Child01의 m3()");
	}
	
	@Override
	public void m2(){
		System.out.println("자식클래스 Child01에서 오버라이딩한 m2()");
	}
}
