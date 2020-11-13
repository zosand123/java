package ch06_oop;

//자동차클래스로 부터 객체를 생성하여 실행하는 클래스
public class Car02_ex01 {

	public static void main(String[] args) {
		//자동차클래스로 부터 객체를 생성
		Car02 car02 = new Car02();
		
		//field값 가져오기 => 참조변수명.필드명
		//company변수는 인스턴스 변수이므로 참조변수명.메소드명으로 접근
		System.out.println(car02.company);
		System.out.println(car02.model);
		System.out.println(car02.color); //자동초기화에 의해 char값은 공백 
		System.out.println(car02.maxSpeed);
		
		
		//field값 변경 > 참조변수명.필드명 = 값;
		car02.color = 'b';
		System.out.println("변경후 색상은 "+car02.color);
		
		//Math.random은 Math클래스의 static 메소드이다
		System.out.println(Math.random()); //랜덤이라는 메소드를 갖고온거
		
		//Math.PI는 Math클래스의 클래스변수이다.
		//static으로 선언된 필드와 메소드는 객체를 생성하지않고도 클래스명.변수명으로 접근가능 
		//참고로 math클래스의 모든 field와 method는 static.
		System.out.println(Math.PI); //필드를 가지고온거
		
		//(실행클래스에서 선언한)메소드호출=> 메소드명();
		// 인스턴스 메소드 호출 => 참조변수명.메소드명();
		car02.abc();
		car02.qwe();
		
		//static 변수 호출 : 클래스명.변수명
		System.out.println(Car02.wheel); //인스턴스 대신 클래스명을 붙임
		
		Car02 car2= new Car02();
		Car02 car3= new Car02();
		System.out.println(car2.wheel);
		System.out.println(car3.wheel);
	}

}
