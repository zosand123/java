package ch07_oop2;

//상수(static final)
public class E_ex01 {
	public static void main(String[] args) {
		
	//field 접제자 속성 데이터타입 변수명 = 초기값;
		
		 System.out.println("지구의 반지름="+E.EARTH_RADIUS);
		 System.out.println("지구의 표면적="+E.EARTH_SURFACE_AREA);
	
	}
}
//상수는 모두 대문자로 작성하는것이 관례. 혼합된이름이면 _로 결합.
//초기값이 단순값이라면 선언시에 초기값을 제시하는 일반적

class E{
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static { //복잡한 초기화일 경우에는 정적블록에서도 할수있다.
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS;
	}
	
}