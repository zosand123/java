package polymorphism;

public class InstanceOf_Ex01 {

	public static void main(String[] args) {
		Parent01 parentA = new Parent01();
		//m1(parentA);
		m2(parentA); //Child03으로 강제 형변환 실패
	}
	static void m1(Parent01 p1){
		//강제형변환을 하게되면 ClassCastException발생할 가능성이 존재
		Child01 ch1 = (Child01)p1;
		System.out.println("m1() : Child01으로 강제형변환 성공");
	}
	static void m2(Parent01 p1){
		if(p1 instanceof Child01) {//강제형변환하기전에 instanceof 연산자로 변환시킬 타입의 객체인지 확인하자
			Child01 ch1 = (Child01)p1;
			System.out.println("m2() : Child01으로 강제형변환 성공");
		}else {
			System.out.println("m2() : Child01으로 강제형변환 실패");
		}
	}
}//class
class Parent01 { }
class Child01 extends Parent01{ }