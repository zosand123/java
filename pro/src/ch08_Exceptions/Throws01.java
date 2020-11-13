package ch08_Exceptions;

//예외 떠넘기기
/* 메소드 내부에서   예외가 발생할 수 있는 코드를 작성할 때는 try~catch블럭으로  예외를 처리한다
 * 경우에 따라서는   메소드를 호출한 곳으로  예외를 떠넘길 수 도 있다
 * 	이 때 사용하는 키워드가  throws이다.
 *  즉 throws키워드는   메소드 선언부 끝에 작성되어
 *  	메소드에서  처리하지 않은  예외를    호출한 곳으로 떠넘기는 역할을 한다
 *  throws키워드 뒤에는 떠넘길 예외 클래스를 ,로 구분하여  여러개 나열할 수 있다
 *  형식>  [접근제어자] [속성] 리턴유형  메서드명(매개변수리스트) throws 예외클래스1,..,예외클래스N{}
 * 
 *  간단히 
 *  [접근제어자] [속성] 리턴유형  메서드명(매개변수리스트) throws Exception{}
 * 
 */
public class Throws01 {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	//메서드선언
	public static void  findClass() throws  ClassNotFoundException{
		Class.forName("java.lang.Double");

		System.out.println("findClass()호출성공");
	}
}

















