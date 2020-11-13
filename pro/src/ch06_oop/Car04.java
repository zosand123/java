package ch06_oop;

/*this - 인스턴스 자신을 가리키는 참조변수, 인스턴스주소가 저장돼있음
 * 참고 : 인스턴스 멤버란 객체(인스턴스)를 생성한 후
 * 사용할수있는 필드와 메소드를 말한다.
 * 이름을 각각 인스턴스 필드, 인스턴스 메소드 라고 부른다
 * 인스턴스 필드와 메소드는 객체에 소속된 멤버이기 때문에
 * 객체없이는 사용할 수 없다.
 * 
 * 객체외부에서 인스턴스멤버에 접근하기 위해
 * 참조변수를 사용하듯이 객체내부에서 인스턴스멤버에 접근하기위해 this를 사용한다.
 * 예) this.필드명, this.메소드명() 
 */
public class Car04 {
	
	//field - [접근제어자] [속성] 데이터타입 변수명[=초기값;]
	String model;
	int speed;
	
	//constructor - [접근제어자] 클래스이름(매개변수리스트){}
	Car04(){}
	
	Car04(String model){ //298p
		this.model = model; //필드명 = 매개변수명 
		//필드명이 매개변수명과 동일하다면 필드명이 매개변수로 
		//인식되므로 필드영앞에 this를 사용한다
	}
	
	
	//method - [접근제어자] [속성] 리턴유형 메소드명(매개변수리스트){}
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {				//i=i+10
		for(int i=60; i<=150; i+=30) {
			this.setSpeed(i);
			System.out.println(model+" runs "+this.speed+"km/h");
		}
	}
	


}
