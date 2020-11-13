package ch08_Exceptions;

/*ClassCastException
 * 타입변환(Casting)은 상위클래스와 하위클래스간 발생
 * 					구현클래스와 인터페이스간에도 발생 
 * 발생원인 : 억지로 타입변환을 시도할경우 ClassCastException 소환
 */
public class ClassCastException01 {

	public static void main(String[] args) {
		Lion lion = new Lion();
		changeLion(lion);
		
		Tiger tiger = new Tiger();
		changeLion(tiger);//런타임에러 Tiger cannot be cast to ch08_Exceptions.Lion
		// 발생이유 : Tiger객체를 changeLion()의 매개값으로 주었기 때문에 => Dog타입으로 변환할 수 없다.
		
	}//main
	
	public static void changeLion(Animal animal){
		//해결방법 : 잘못된 매개값이 들어올 수 있기 때문에 타입을 먼저 체크하기 
		if(animal instanceof Lion) {
			Lion lion = (Lion)animal;
			}
		}
}

class Animal{}
class Lion extends Animal{}
class Tiger extends Animal{}