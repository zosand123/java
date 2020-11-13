package ch06_oop;

//264p
class Data{int x;}//자동 초기화에 의해 x=0; 

public class PrimitiveParamEx {

	public static void main(String[] args) {
		
		Data d = new Data();//d에는 heap영역에 생성된 객체주소가 저장
		System.out.println("d.x="+d.x); 
		
		d.x=10;
		System.out.println("변경 전 d.x="+d.x);
		
		change(d.x); //static 함수는 static 함수를 호출할 수있다.
		System.out.println("변경 후 d.x="+d.x);
	}
		static void change(int x) {
			x=1000;
			System.out.println("changed x="+x);
			
		}
}


