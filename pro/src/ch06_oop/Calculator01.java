package ch06_oop;

//계산기클래스
//메소드선언 
public class Calculator01 {
	
	//method
	//접근 제어자 속성 리턴유형 메소드명(매개변수리스트){}
	//전원키기 
	
	//더하기
	
	void a() {
		System.out.println("a()");
		b(); //메소드안에서 다른메소드 호출가능 //this.b();
	}
	void b() {
		System.out.println("b()");
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	

	int plus(int x,int y) { //리턴값이 있는 메소드 
		int result = 0;
		result = x + y;
		return result;
		//return은 구현결과값을 함수를 호출한 자리에 되돌려준다.
		//return 자체가 해당 함수를 종료한다 의미. 리턴밑에는 코드 못써용
	}
	
	void plus(double a, double b) { //리턴값이 없는 메소드
			
			//return a+b;
			double result = a + b;
			System.out.println(result); 
		}
	
	double divide(int c, int d) {
		
		//return c/d;
		double result= c/d;
		return result;
	}
	
	//method overloadig 283P
	//원칙적으로 동일 클래스내 메소드명이 동일 할 수 없다
	//하지만 매개변수의 타입,개수,순서가 다르면 선언가능하다
	//앞에서 선언한 divide와는 다르게 매개변수의 순서가 다르다
	double divide(int c, double d) {
			
		//return c/d;
		double result= c/d;
		return result;
		}
	double divide( double d, int c) {
		
		//return c/d;
		return c/d;
		
		}
	//전원끄기
	void powerOff (){
		System.out.println("전원을 끕니다");}
	
}
