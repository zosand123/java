package ch07_oop2;

/*생성자의 접근 제어자- 교재 p351
	- 일반적으로 생성자의 접근 제어자는 클래스의 접근 제어자와 일치.
	- 생성자에 접근 제어자를 사용함으로써 인스턴스 생성 제한.

전체 프로그램에서 단 하나의 객체만 만들도록 보장해야 하는 경우
단 하나만 생성한다고 해서 이 객체를 싱글톤(Singleton)이라고 한다.

싱글톤 클래스가 되기위해서는
1. 필드는 private static 클래스타입으로 선언되어야 한다
 	private static 클래스타입 참조변수명
    초기값으로 객체가 생성되어야 한다.	
    new 클래스명();
 
2. 생성자는 private으로 선언되어야 한다.
	private 클래스명(){}

 3. 객체를 제공하는 메서드는  public static 클래스객체를 리턴해야 한다
 	public static  클래스타입  메서드명(){}
 
 public  class 클래스명{
 	//field
	private static 클래스명 	참조변수명 = new 클래스명();
	
	//constructor
	private  클래스명(){}
	
	//객체제공메서드
	public static  클래스타입  메서드명(){  return 클래스참조변수명; }
  }
  
---------------------------
싱글톤 클래스객체를 사용시에는
   클래스명 참조변수명 = 클래스명.메서드명();
  아래 예제에서는  
  Singleton s = Singleton.getInstance();
*/


public class Singleton {
	//field
	private static Singleton s = new Singleton();
	
	//constructor
	//public Singleton(){}
	private Singleton(){}
	
	//객체를 제공하는 메소드
	//==> 객체가 생성된 heap영역의 주소를 반환하는 메서드
	public  static  Singleton  getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return  s;
	}
	
	//method
	public void test() {}
}
