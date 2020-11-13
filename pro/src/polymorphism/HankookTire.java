package polymorphism;
//Car02_poly,Tire,HankookTire,KumhoTire,CarExample01

public class HankookTire extends Tire{
	public HankookTire() {}
	public HankookTire(String location,int maxRotation) {
		//super() 조상클래스의 생성자를 호출, 반드시 생성자의 첫번째 라인에서 작성
		super(location,maxRotation);
			//super.location = location;
			//super.maxRotation = maxRotation;
	}
	
	@Override
	public boolean roll(){
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {//누적회전수<최대회전수
			System.out.println(location+
		    " 한국타이어의 수명이 "+(maxRotation-accumulatedRotation)+" 남았습니다.");
			return true; //정상적으로 굴러가는 상태
		}else { //누적회전수==최대회전수 = 펑크발생
			System.out.println("** "+location+" 한국타이어 펑크남"+" **");
			return false;
		}
	}//roll
	
}
