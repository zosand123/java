package ch08_Exceptions;

/* 문자열로 되어있는 데이터를 숫자로 변경할 때 발생할 수 있다.
 * => 가장 빈번하게 사용되는 코드
 * Integer.parseInt(문자열)  : 문자열을 정수로 변환
 * Double.parseDouble(문자열) : 문자열을 실수로 변환
 */
public class NumberFormatException01 {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); 
			//런타임에러 : java.lang.NumberFormatException: For input string: "a100"
				//발생이유 : a100 문자열은 숫자로 변환할수 없다 
		int result = value1+value2;
		System.out.println(value1+"+"+value2+"="+result);
	}
}
