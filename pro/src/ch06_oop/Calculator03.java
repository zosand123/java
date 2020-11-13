package ch06_oop;

//정적멤버 - 클래스변수,클래스메서드(static)
/*클래스변수 : 같은 클래스의 모든 인스턴스들이 공유하는 변수
 * 클래스 메서드 : 메소드내에서 인스턴스변수를 사용하지않는다면 static을 붙이는것을 고려한다
 * 				인스턴스변수나 인스턴스메소드와 관련없는 작업을 하는 메서드
 * 여기에서는 원넓이와 둘레를 구할 때 필요한 파이는 객체마다 서로 다르지않고 공통된 데이터를 사용하니
 * static변수로 선언
 * 
 * 여기서 plus,minus 기능은 외부에서 함수를 호출 할 때 주어진 매개값을 가지고
 * 		계산을 하므로 인스턴수변수가 필요없으므로 static 메소드로 선언하였다
 */
public class Calculator03 {
	//field - 접제자 static 데이터타입 변수명 = 초기값;
	static double pi = 3.142592; 
	
	//method 접제자 static 리턴유형 메소드명(매변리) {}
	static int plus(int x,int y) {return x+y;}
	static int minus(int x,int y) {return x-y;}
}
