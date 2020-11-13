package interface01;
//1028-3 실행클래스
//추상클래스의 객체를 생성하지 못하므로
//추상클래스의 기능,필드을 사용하고 싶다면 
//그것을 상속받는 실행클래스의 객체를 생성하여 사용
public class PhoneExample {

	public static void main(String[] args) {
		//Phone ph = new Phone("내거");//Cannot instantiate the type Phone
		//Phone의 생성자를 호출해서 객체를 생성할 수 없다
		SmartPhone ph = new SmartPhone("내거");
		ph.turnOn();
		ph.turnOff();//부모(추상)클래스의 메서드 호출
		ph.internet(); //SmartPhone의 메서드를 호출
		
	}

}
