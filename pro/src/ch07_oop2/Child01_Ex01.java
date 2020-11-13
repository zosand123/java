package ch07_oop2;

public class Child01_Ex01 {

	public static void main(String[] args) {
		Child01 ch = new Child01();
		Parent01 p1 = ch; //자동타입변환: 부모클래스 참조변수 = 자식 참조변수
		p1.m1();
		p1.m2(); // p1이 자식객체를 참조해도 접근가능한 멤버는 부모클래스의 멤버로 한정됨
				// 그러나 오버라이딩한 메소드는 오버라이딩된 상태로 호출
		
		//p1.m3();//The method m3() is undefined for the type Parent01
		GrandChild01 gc1 = new GrandChild01();
		p1 = gc1; //계층추적. 자바는 단일상속만을 허용하므로 계층추적이 가능하다
		
		p1.m1(); // 그냥 m1
		p1.m2(); // GrandChild01에서 오버라이딩된 m2
		//p1.m3(); //부모클래스 멤버가 아니라서 안됨
		
	}

}
