package ch07_oop2;

//final field - 초기값이 저장되면 최종적인 값이 된다. 프로그램실행도중 변경x
public class Person01 {

	//field 접제자 속성 데이터타입 변수명 = 초기값;
//	final String nation = "Republic of Korea";
//	final String ssn = "949494-2994949";
//	final String name = "안은영";
//	final double height = 163;
	final String nation = "Republic of Korea"; // 객체마다 공통값을 가지므로 초기값부여
	final String ssn;						   // 주민번호는 객체생성할때마다 다른값을 가지므로 초기값x
	String name;
	
	
	//constructor 접제자 클래스명(매변리){}
	//Person01(){} // 생성자는 final필드의 최종초기화를 마쳐야하는데 그렇지 않아서 에러발생 
	//The blank final field ssn may not have been initialized
	
	public Person01(String ssn,String name){
		this.ssn = ssn;
		this.name = name;
	}
	
	//method 접제자 속성 리턴유형 메소드명(매변리){}

}

/* 상수 (static final)
 *  -불변의값을 상수라고 부른다 ex)파이,지구의둘레
 *  -자바에서는 상수(constant)라고 한다
 *  static 공용성 final 불변
 *  공용성을 띈 불변의 값을 상수라고한다
 *  static final 데이터타입 상수명 [=초기값];
 */

