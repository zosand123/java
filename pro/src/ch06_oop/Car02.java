package ch06_oop;

/*클래스 구성멤버
1.field : 객체의 데이터가 저장되는곳
[접근제어자] [속성] 데이터타입 변수명;

2.constructor 생성자 : 객체 생성시 초기화 역할 담당

3.method : 객체의 동작에 해당되는 실행블록
 
 */

public class Car02 {
	
	//field
	String company="조은자동차";	//제조사 //전역변수 : 클래스영역에서 사용할 수있다.
	//인스턴스 변수 : 인스턴스 생성후, 참조변수명.메소드명으로 접근
	
	String model;	//모델
	char color; 	//색상 //char 타입은 작은따옴표 ''로 표시
	int maxSpeed; 	//최고속도 
	
	static int wheel=4; //클래스변수.static변수. 
	//인스턴스없이 클래스명.메소드명으로 접근
	//모든 인스턴스에서 공유되는 값

	//method
	void abc() {
		System.out.println("abc()안에서 접근한="+company);
		//company는 전역변수로 선언했으므로 abc()안에서 접근할 수 있다
	}
	
	void qwe() {
		System.out.println("qwe()안에서 접근한="+company);
		//company는 전역변수로 선언했으므로 qwe()안에서 접근할 수 있다
	}
	
	
	
		
}
