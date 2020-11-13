package ch07_oop2;
//다형성  
//자동타입변환(Promotion): 자손타입->조상타입(업캐스팅) : 형변환 생략가능 
//실행메소드
//하나의 소스파일안에 여러개 클래스 담을때는 하나만 퍼블릭이고 그 클래스명이 소스파일명이돼야한다
class A{}

class B extends A{} 
class C extends A{}

class D extends B{}
class EE extends C{}

public class Promotion_Ex {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		EE e = new EE();
		
		//자동타입변환 된 이후에는 부모클래스에서 선언된 필드,메소드만 접근가능
		//변수가 자식객체를 참조하지만 변수로 접근가능한 멤버는 부모클래스멤버로 한정된다.
		//예외적으로 자식클래스에서 메소드가 오버라이딩되었다면
		//자식클래스의 메소드가 (부모클래스에 선언된 메소드 대신해) 호출된다 => Chaild01, Parent01 참고
		
		A a1 = b; 
		A a2 = c; 
		A a3 = d; 
		A a4 = e;
		
		B b1 = d; 
		//d객체는 b 부모타입으로 자동타입변환
		
 	}

}
