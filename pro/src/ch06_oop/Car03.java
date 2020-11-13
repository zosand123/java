package ch06_oop; //292p, 294p, 295p

//다른 생성자를 호출하는 this()
/*생성사 오버로딩이 많아질경우 생성자간의
 * 중복된 코드가 발생할 수 있다
 * 매개변수의 수만 달리하고,
 * 필드 초기화 내용이 비슷한 생성자에서 이런 현상을 많이 볼 수 있다.
 * 이런 경우에는 필드초기화내용은 한 생성자에서만 집중적으로 작성하고
 * 나머지 생성자는 초기화내용을 가지고 있는 생성자를 호출하는 방법으로
 * 개선할 수있다
 *
 *주의.반드시 생성자안에서 천번째 문장으로 작성해야한다 
 *
 */

public class Car03 {

	//field - [접근제한자] [속성] 데이터타입 변수명; 
	String company = "잘달려자동차";
	String model; 
	String color;
	int maxSpeed;
	
	//constructor - [접근제한자] 클래스명(매개변수리스트){}
	Car03(){
		System.out.println("default constructor");
		//아무것도 안써도 가능 
	}
	
	//model 초기화생성자
	Car03(String cmodel){
		//model = cmodel;
		//Car03(cmodel,"yellow");//error
		this(cmodel,"yellow");//this는 생성자에서 또 다른 생성자를 호출(원래 생성자는 다른 생성자를 호출불가하지만 this를 사용하면 가능하다
	}
	
	//model,color 초기화생성자
	Car03(String cmodel, String cColor){
		this(cmodel,cColor,500); //생성자호출할때는 반드시 생성자의 첫번째문장에서 호출해야 작동함!
	
	}
	
	//model,color,maxSpeed 초기화생성자
	Car03(String cmodel, String cColor, int cmaxSpeed){
		model = cmodel;
		color = cColor;
		maxSpeed = cmaxSpeed;
		
		
	}
	
	
	
	//method - [접근제한자] [속성] 리턴유형 메소드명(매개변수리스트){}
}
