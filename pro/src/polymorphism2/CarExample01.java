package polymorphism2;
//필드의 다형성을 살펴보는 실행클래스
//Car02_poly,Tire,HankookTire,KumhoTire,CarExample01

public class CarExample01 {

	public static void main(String[] args) {
		//Car01클래스의 객체생성
		Car car = new Car();
		//Car01객체의 run()을 5번 반복실행
		for(int i=1; i<6; i++) {
			int problemLocation = car.run();
		
			switch(problemLocation) {
			case 1  : System.out.println("앞왼쪽 한국타이어로 교체");
				car.tires[0] = new HankookTire("앞왼쪽",15); //자동타입변환
				//부모클래스 참조변수 = new 자식클래스명();
				//Car01의 필드에는 타이어클래스타입의 필드 flTire가 선언되어있다.
				//따라서 car01의 필드인 flTire에 HankookTire()객체가 들어갈 수 있다.
					break;
			case 2  : System.out.println("앞오른쪽 금호타이어로 교체");
				car.tires[1] = new KumhoTire("앞오른쪽",13);
					break;
			case 3  : System.out.println("뒤왼쪽 한국타이어로 교체");
			    car.tires[2] = new HankookTire("뒤왼쪽",14);
					break;
			case 4  : System.out.println("뒤오른쪽 금호타이어로 교체");
				car.tires[3] = new KumhoTire("뒤오른쪽",17);
					break;
			}//switch
			System.out.println("----------------------");//문제없이 잘 굴러간경우
			
		}//for
	}//main
}//CarExample01
