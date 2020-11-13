package ch06_oop;

import java.util.Date;

//자동차에 대한 속성(과 기능)을 가진 클래스

//클래스는 설계도
//클래스 - 속성(field),기능(method)
public class Car01 {
	//속성 => field => 변수선언
	//[접근제한자] [속성] 데이터타입 변수명;
	//고유데이터  //색상- 빨주노초 , 제조사 - 현대 기아 ,최고속도 , 제조날짜 yyyy-mm-dd 년 월 일
	String color = "white"; //색상
	String maker = "Hyandai"; //제조사
	int maxSpeed; //최고속도
	Date makeDate = new Date() ; //제조날자
	int price = 3000;
	double maxKGM;//최대토크
	
	//상태데이터 - 현재속도, 엔진회전수 
	int speed;//현재속도
	
	//부품 - 또다른 클래스도 필드로 사용할 수 있다.
	//Engine engine;
	
	//생성자(constructor)
	
	//기능 method
	//[접근제한자] [속성] 리턴유형 함수명(매개변수리스트){}
	//움직이다
	void move() {
		System.out.println("move()호출성공!");
	}
	
	//멈추다
	void stop() {
		System.out.println("stop()메소드 호출성공!");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Date getMakeDate() {
		return makeDate;
	}

	public void setMakeDate(Date makeDate) {
		this.makeDate = makeDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getMaxKGM() {
		return maxKGM;
	}

	public void setMaxKGM(double maxKGM) {
		this.maxKGM = maxKGM;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//source > generate getters and setters  자동으로 겟셋함수 만들어줌!!
}
