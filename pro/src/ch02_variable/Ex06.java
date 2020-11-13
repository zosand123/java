package ch02_variable;

//연산식에서의 자동타입변환
public class Ex06 {

	public static void main(String[] args) {
		//1byte <02short,2char<4int>8long 정수 <실수 4float<8double
		//정수<실수
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte) (b1 + b2);
		//int보다 작은 타입(byte,short,char)이 연산에 사용되면 int로 자동형변환된다 
		int i1 = b1 + b2;
		
		char c1 = 'A';
		char c2 = 1;
		char c3 = (char) (c1 + c2);
		int i3 = c1 + c2;
		System.out.println(i3);
		
		int i4 = 10;
		int i5 = i4/4; //10을 4로 나눈 몫이 int타입 변수 i5에 저장
		//몫은 2.5으로 실수형이지만 정수 int에 저장되면서 값손실 발생
		int i6 = i4+i5;
		System.out.println(i5);
		System.out.println(i6);
		
		int i7 = 10;
		double i8 = 10/4.0;
		//연산식에 실수리터럴이나 double타입이 있다면 다른 피연산자도 double타입으로 자동형변환된다.
	
	}

}
