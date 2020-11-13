package ch07_oop2;

//AirPlane 상속받고 초음속비행기능을 추가 탑재한 클래스
//super:부모클래스의 멤버주소가 저장되어있는 참조주소
//참고 this : 자기자신클래스의 참조주소
public class SupersonicAirPlane extends AirPlane {
	
	void test() {
		super.model = "goo";
		System.out.println("test()안의 super.model="+super.model);
	}

}
