package polymorphism2;
//연관클래스 : Car,Tire,HankookTire,KumhoTire,CarExample01
//이 클래스는 Tire01클래스를 부품으로 가지는 클래스이다
//자동차는 Tire를 가진다 has a 관계! 

public class Car {
	//field
	String company;
	int price;
	String color;
	
	//부품관계의 field
	//차에 타이어 장착
	//동일한 타입은 배열로 처리할수있다
	Tire[] tires = {new Tire("앞왼쪽",3),new Tire("앞오른쪽",2),
			new Tire("뒤왼쪽",4),new Tire("뒤오른쪽",5)};

	//constructor
	public Car(){}
	
	//자동차가 가진 4개의 타이어가 모두 1회씩 회전시켜야한다
	//각 Tire01객체의 roll()메서드를 호출한다
	//호출한 roll()메서드가 false를 리턴하는 경우에는
	//자동차를 멈추기위해 stop()메서드를 호출하고
	//문제가 발생한 해당타이어의 번호를 리턴
	int run() {
		System.out.println("자동차가 달리는 중");
		for(int i =0; i<tires.length; i++) { //리팩토링! 
			if(tires[i].roll()==false) { stop(); return i+1;} 
		}//for
			return 0; //정상회전시
	}//run
	void stop() {
		System.out.println("차가 멈췄습니다"); //타이어가 펑크날때
	}
}
