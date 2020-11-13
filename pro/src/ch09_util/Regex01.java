package ch09_util;

import java.util.regex.Pattern;

//정규식(Regular Expression)-정규표현식. 교재p505
//Pattern클래스
public class Regex01 {

	public static void main(String[] args) {
		String emailData = "HOng123@testQ1.co.org";
		String regExp0   = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		//   \w		=> word.  알파벳대소문자 A-Za-z  숫자0-9   _문자
		//	+		=> 1번이상
		//	\w+     => 알파벳대소문자 또는 숫자가 1번이상 
		// @		=> @문자
		// \.       => .문자
		// ?		=> 0번 또는 1번
		//(\\.\\w+)?=> .뒤에  알파벳대소문자숫자 1개이상으로  된  문자가  1또는 생략
		
		
		boolean result0 = Pattern.matches(regExp0, emailData);
		if(result0) {
			System.out.println("정규식과 일치한다");
		}else {
			System.out.println("정규식과 일치x");
		}
		System.out.println();
		
		String tel = "02-111-1234";
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		//02|010   	=> 02 또는 010
		//-			=>  -문자
		//  \d		=> digit을 의미. [0-9]와 동일
		//{3,4}		=> 3자리~4자리
		// \d{3,4}  => 숫자가 최소 3글자~최대 4글자 가능 
		//{4}		=> 4자리
		
		boolean result = Pattern.matches(regExp, tel);
		if(result) {
			System.out.println("정규식과 일치한다");
		}else {
			System.out.println("정규식과 일치x");
		}
		
	}

}









