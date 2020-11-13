package ch07_oop2;

public class Com_cal__overrding_ex01 {

	public static void main(String[] args) {
		Calculator_overriding2 cal = new Calculator_overriding2();
		System.out.println("원면적="+cal.areaCircle(10));
		System.out.println();
		
		Computer_cal_overriding2 cal2 = new Computer_cal_overriding2();
		System.out.println("원면적="+cal2.areaCircle(10));
		//자식클래스인 computer에서 제정의한 메소드 호출
		System.out.println();
		
		//다형성
		//조상타입의 참조변수를 자손타입의 인스턴스로 참조
		//computer is a calculator
		//부모클래스 참조변수 = new 자식클래스
		Calculator_overriding2 obj = new Computer_cal_overriding2();
		System.out.println("원면적="+obj.areaCircle(10));
		
	}

}
