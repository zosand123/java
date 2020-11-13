package polymorphism2;
//Car02_poly,Tire,HankookTire,KumhoTire,CarExample01
//이클래스의 다이렉트서브클래스로 한국타이어와 금호타이어가있다

public class Tire {
	//field
	public int maxRotation; // 최대회전수(=>타이어수명)
	public int accumulatedRotation; //누적회전수
	public String location;	//타이어의 위치 1:앞왼 2:앞오른 3:뒤왼 4:뒤오른
	
	//constructor
	public Tire() {}
	public Tire(String location,int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//method
	public boolean roll(){
			++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {//누적회전수<최대회전수
			System.out.println("** "+location+
		    " 타이어수명이"+(maxRotation-accumulatedRotation)+"남았습니다 **");
			return true; //정상적으로 굴러가는 상태
		}else { //누적회전수==최대회전수 = 펑크발생
			System.out.println("** "+location+" 펑크남"+" **");
			return false;
		}
	}//roll
}//Tire
