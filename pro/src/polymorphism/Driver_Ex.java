package polymorphism;

public class Driver_Ex {

	public static void main(String[] args) {
		Drive d = new Drive();
		d.drive(new Vehicle());
		d.drive(new Bus()); //drive()메소드가 호출되면서 들어간 매개변수의 타입이 자동타입변환됨
					//자손 Bus가 run()을 오버라이딩해서 오버라이딩된 run()메소드가 호출되어 실행됨
		d.drive(new Taxi());
		
	}

}
