package ch07_oop2;

public class Car01_ex01 {
	public static void main(String[] args) {
		Car01 c1 = new Car01();
		//c1.speed; 은닉화돼서 외부에서 접근불가 
		//c1.stop;
		c1.setSpeed(100);
		System.out.println("현재스피드는 "+c1.getSpeed());
		
		if(!c1.isStop()) {
			c1.setStop(true); //boolean은 값안주면 기본값 false
			System.out.println(c1.isStop());
		}
		
	
		
	}
}
