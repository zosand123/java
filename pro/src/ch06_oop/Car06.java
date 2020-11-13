package ch06_oop;

//*정적메소드와 블록
public class Car06 {
	//필드 -접제자 속성 타입 변수명=초기값;
	int speed; //인스턴스변수
	static String company = "Piagio";
	
	//인스턴트메소드
	void run() {
		System.out.println("run()호출성공");
	}
 
	public static void main(String[] args) {
		Car06 c6 = new Car06();  
		//인스턴스멤버를 사용하기위해서는 먼저 인스턴스를 생성해야한다
		
		c6.speed = 100;
		System.out.println(c6.speed);
		
		//static멤버는 클래스명.변수명,클래스명.메소드명();
		System.out.println(Car06.company);
		c6.run();
		
		
	}
}

class Car061{
	//인스턴스필드 &메서드
	int field1;
	void method1() {}
	
	//정적필드앤 메소드로 선언
	static int field2;
	static void method2() {}
	
	//정적블록
	//인스턴스변수 선언불과
	static{
		int field3;
		int field4;
		//field1 = 100; : 컴파일에러
		field2 = 100;
		//method1(); : 컴파일에러  
		method2();
	}
	
	//정적메소드 선언
	static void lalala() { //안됨
		//field1 = 100;
		//this.field1 = 100;
		field2 = 100;
		method2();
		
		//mais tu peux ecrire un code d'instance qui marche
		Car061 c61 = new Car061();
		c61.field1 = 100;
		c61.method1();
	}
}