package ch09_util;
//1029-1
public class String01 {

	public static void main(String[] args) {
		//==비교 : 주소비교
		String str1 = "이미선";
		String str2 = "이미선";
		System.out.println(str1.equals(str2)); //=System.out.println(str1.toString()); 
		//Object클래스의 toString()을 오버라이딩한 String클래스의 메소드가 호출되어 실행된것.
		
		System.out.println((str1==str2)); //true
		//==결과가 true인것은 str1과 str2변수가 동일한 주소를 참조하고있어서이다.
		//문자열 리터럴이 동일하다면 동일한 String객체를 참조한다
		
		//하지만 new연산자로 생성되면 서로 다른 String객체를 참조한다.
		String str3 = new String("이미선");
		String str4 = new String("이미선");
		System.out.println((str3==str4)); //false
		
		//문자열비교(equals) : 값비교
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
	}

}
